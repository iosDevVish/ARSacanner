package com.ardrawing.ardrawing

import android.app.AlertDialog
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.os.Environment
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts.RequestPermission
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.ardrawing.ardrawing.data.DrawingEntity
import com.ardrawing.ardrawing.databinding.ActivityMainBinding
import com.ardrawing.ardrawing.drawing.DrawingSettings
import com.ardrawing.ardrawing.drawing.DrawingStroke
import com.ardrawing.ardrawing.drawing.Lesson
import com.ardrawing.ardrawing.drawing.LessonProgress
import com.ardrawing.ardrawing.drawing.ToolType
import com.ardrawing.ardrawing.ui.dialogs.BrushSizeBottomSheet
import com.ardrawing.ardrawing.ui.dialogs.ColorPickerBottomSheet
import com.ardrawing.ardrawing.ui.dialogs.GuideSelectorBottomSheet
import com.ardrawing.ardrawing.ui.dialogs.LessonSelectorBottomSheet
import com.ardrawing.ardrawing.ui.dialogs.SaveDrawingDialog
import com.ardrawing.ardrawing.ui.dialogs.SettingsDialog
import com.ardrawing.ardrawing.viewmodel.DrawingViewModel
import com.google.ar.core.Anchor
import com.google.ar.core.Camera
import com.google.ar.core.Frame
import com.google.ar.core.HitResult
import com.google.ar.core.TrackingState
import com.google.ar.sceneform.ArSceneView
import com.google.ar.sceneform.FrameTime
import com.google.ar.sceneform.HitTestResult
import com.google.ar.sceneform.Node
import com.google.ar.sceneform.ux.ArFragment
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import java.io.File
import java.io.FileOutputStream
import java.util.concurrent.atomic.AtomicBoolean
import android.graphics.Color
import com.ardrawing.ardrawing.drawing.DrawingState
import com.ardrawing.ardrawing.util.Point3D
import com.ardrawing.ardrawing.util.StrokeData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var arFragment: ArFragment
    private lateinit var arSceneView: ArSceneView
    private val viewModel: DrawingViewModel by viewModels()
    private var drawingSettings = DrawingSettings()
    private var isDrawing = false
    private var hasPlacedCanvas = false
    private var canvasAnchor: Anchor? = null
    private var canvasNode: Node? = null
    private val currentStrokePoints = mutableListOf<Point3D>()
    private var currentStrokeId = 0L
    private val undoStack = mutableListOf<DrawingState>()
    private val redoStack = mutableListOf<DrawingState>()
    private var currentDrawingState = DrawingState()
    private val scope = CoroutineScope(Dispatchers.Main)
    private val isArReady = AtomicBoolean(false)
    private var lastFrameTime = 0L
    private var frameCount = 0

    private var currentLesson: Lesson? = null
    private var currentLessonProgress: LessonProgress? = null

    private val cameraPermissionLauncher = registerForActivityResult(RequestPermission()) { result: Boolean ->
        if (!result) {
            showPermissionDeniedDialog()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupArFragment()
        setupUI()
        setupObservers()
        checkArCoreAvailability()
    }

    private fun setupArFragment() {
        arFragment = supportFragmentManager.findFragmentById(R.id.ar_fragment) as ArFragment
        arSceneView = arFragment.arSceneView

        arSceneView.setCameraStreamRenderPriority(CameraStreamRenderPriority.RENDER_FIRST)
        arSceneView.scene.addOnUpdateListener { frameTime -> onSceneUpdate(frameTime) }

        arFragment.setOnTapArPlaneListener { hitResult, plane, _ ->
            if (!hasPlacedCanvas && plane.trackingState == TrackingState.TRACKING) {
                placeCanvas(hitResult)
            }
        }

        arFragment.arSceneView.scene.setOnTouchListener { hitResult, motionEvent ->
            onTouchScene(hitResult, motionEvent)
        }
    }

    private fun setupUI() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        supportActionBar?.title = getString(R.string.app_name)

        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_lessons -> showLessonSelector()
                R.id.action_guides -> showGuideSelector()
                R.id.action_settings -> showSettings()
                R.id.action_gallery -> openGallery()
                R.id.action_help -> showTutorial()
                else -> false
            }
            true
        }

        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_draw -> {
                    showDrawingTools()
                    true
                }
                R.id.nav_lessons -> {
                    showLessonSelector()
                    true
                }
                R.id.nav_gallery -> {
                    openGallery()
                    true
                }
                R.id.nav_settings -> {
                    showSettings()
                    true
                }
                else -> false
            }
        }

        setupDrawingToolbar()
    }

    private fun setupDrawingToolbar() {
        binding.drawingToolbar.btnUndo.setOnClickListener { undo() }
        binding.drawingToolbar.btnRedo.setOnClickListener { redo() }
        binding.drawingToolbar.btnBrush.setOnClickListener { showBrushSizePicker() }
        binding.drawingToolbar.btnColor.setOnClickListener { showColorPicker() }
        binding.drawingToolbar.btnGuides.setOnClickListener { showGuideSelector() }
        binding.drawingToolbar.btnClear.setOnClickListener { showClearConfirmDialog() }
        binding.drawingToolbar.btnSave.setOnClickListener { showSaveDialog() }
    }

    private fun setupObservers() {
        viewModel.allDrawings.observe(this) { _ ->
        }

        viewModel.allLessons.observe(this) { _ ->
        }

        viewModel.allLessonProgress.observe(this) { _ ->
        }
    }

    private fun checkArCoreAvailability() {
        val isSupported = com.google.ar.core.ArCoreApk.getInstance().checkAvailability(this).isSupported
        if (!isSupported) {
            Toast.makeText(this, R.string.toast_ar_not_supported, Toast.LENGTH_LONG).show()
            finish()
        }
    }

    private fun onSceneUpdate(frameTime: FrameTime) {
        if (!isArReady.get()) return

        val frame = arSceneView.arFrame
        val camera = frame?.camera

        if (camera != null) {
            updateRenderers(frame, camera)
            updateTrackingStatus(frame)
        }

        updateFPS()
    }

    private fun updateRenderers(frame: Frame, camera: Camera) {
        val viewMatrix = FloatArray(16)
        val projectionMatrix = FloatArray(16)

        camera.getViewMatrix(viewMatrix, 0)
        camera.getProjectionMatrix(projectionMatrix, 0, 0.1f, 100f)

        val mvpMatrix = FloatArray(16)
        android.opengl.Matrix.multiplyMM(mvpMatrix, 0, projectionMatrix, 0, viewMatrix, 0)
    }

    private fun updateTrackingStatus(frame: Frame) {
        val camera = frame.camera
        val trackingState = camera.trackingState

        val message = when (trackingState) {
            TrackingState.TRACKING -> getString(R.string.ar_tracking_normal)
            TrackingState.PAUSED -> getString(R.string.ar_tracking_limited)
            else -> getString(R.string.ar_tracking_none)
        }

        if (trackingState != TrackingState.TRACKING) {
            binding.arInstructionCard.visibility = View.VISIBLE
            binding.arInstructionCard.findViewById<android.widget.TextView>(android.R.id.text1)?.text = message
        } else if (hasPlacedCanvas) {
            binding.arInstructionCard.visibility = View.GONE
        }
    }

    private fun placeCanvas(hitResult: HitResult) {
        val anchor = hitResult.createAnchor()
        canvasAnchor = anchor

        canvasNode = Node()
        canvasNode?.setParent(arSceneView.scene)
        canvasNode?.setLocalPosition(com.google.ar.sceneform.math.Vector3(
            hitResult.hitPose.tx(),
            hitResult.hitPose.ty(),
            hitResult.hitPose.tz()
        ))
        canvasNode?.setLocalRotation(com.google.ar.sceneform.math.Quaternion(
            hitResult.hitPose.qx(),
            hitResult.hitPose.qy(),
            hitResult.hitPose.qz(),
            hitResult.hitPose.qw()
        ))

        hasPlacedCanvas = true
        isArReady.set(true)

        binding.arInstructionCard.visibility = View.GONE
        binding.drawingToolbar.root.visibility = View.VISIBLE
        binding.fabDraw.visibility = View.GONE

        Toast.makeText(this, R.string.tap_to_start, Toast.LENGTH_SHORT).show()
    }

    private fun onTouchScene(hitTestResult: HitTestResult, motionEvent: MotionEvent): Boolean {
        if (!hasPlacedCanvas) return false

        when (motionEvent.action) {
            MotionEvent.ACTION_DOWN -> {
                if (drawingSettings.currentTool == ToolType.BRUSH || drawingSettings.currentTool == ToolType.ERASER) {
                    startStroke(hitTestResult)
                }
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                if (isDrawing) {
                    continueStroke(hitTestResult)
                }
                return true
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (isDrawing) {
                    endStroke()
                }
                return true
            }
        }
        return false
    }

    private fun startStroke(hitTestResult: HitTestResult) {
        isDrawing = true
        currentStrokePoints.clear()
        currentStrokeId = System.currentTimeMillis()

        val point = getWorldPoint(hitTestResult)
        currentStrokePoints.add(point)

        if (drawingSettings.hapticFeedback) {
            binding.root.performHapticFeedback(android.view.HapticFeedbackConstants.VIRTUAL_KEY)
        }
    }

    private fun continueStroke(hitTestResult: HitTestResult) {
        val point = getWorldPoint(hitTestResult)
        point?.let { currentStrokePoints.add(it) }

        if (currentStrokePoints.size >= 2 && drawingSettings.brushSmoothing > 0) {
            val smoothed = smoothStroke(currentStrokePoints, drawingSettings.brushSmoothing)
            updateStrokePreview(smoothed)
        } else {
            updateStrokePreview(currentStrokePoints)
        }
    }

    private fun endStroke() {
        isDrawing = false

        if (currentStrokePoints.size >= 2) {
            val finalPoints = if (drawingSettings.brushSmoothing > 0) {
                smoothStroke(currentStrokePoints, drawingSettings.brushSmoothing)
            } else {
                currentStrokePoints.toList()
            }

            saveStroke(finalPoints)
            updateLessonProgress()
        }

        currentStrokePoints.clear()
    }

    private fun getWorldPoint(hitTestResult: HitTestResult): Point3D {
        val point = hitTestResult.point
        return Point3D(point.x, point.y, point.z)
    }

    private fun smoothStroke(points: List<Point3D>, smoothing: Float): List<Point3D> {
        if (points.size < 3) return points

        val smoothed = mutableListOf<Point3D>()
        smoothed.add(points.first())

        for (i in 1 until points.size - 1) {
            val prev = points[i - 1]
            val curr = points[i]
            val next = points[i + 1]

            val smoothedPoint = Point3D(
                curr.x + (next.x - prev.x) * smoothing * 0.1f,
                curr.y + (next.y - prev.y) * smoothing * 0.1f,
                curr.z + (next.z - prev.z) * smoothing * 0.1f
            )
            smoothed.add(smoothedPoint)
        }

        smoothed.add(points.last())
        return smoothed
    }

    private fun updateStrokePreview(points: List<Point3D>) {
        val strokeData = StrokeData(
            points = points,
            color = drawingSettings.currentColor,
            brushSize = drawingSettings.brushSize,
            opacity = if (drawingSettings.currentTool == ToolType.ERASER) 1f else drawingSettings.brushOpacity,
            toolType = drawingSettings.currentTool.id
        )
    }

    private fun saveStroke(points: List<Point3D>) {
        val stroke = DrawingStroke(
            points = points,
            color = drawingSettings.currentColor,
            brushSize = drawingSettings.brushSize,
            opacity = drawingSettings.brushOpacity,
            toolType = drawingSettings.currentTool
        )

        saveStateForUndo()
        currentDrawingState = currentDrawingState.addStroke(stroke)

        val strokeData = stroke.toStrokeData()
        scope.launch {
            viewModel.insertStroke(strokeData)
        }
    }

    private fun saveStateForUndo() {
        undoStack.add(currentDrawingState)
        if (undoStack.size > 50) undoStack.removeAt(0)
        redoStack.clear()
    }

    private fun undo() {
        if (undoStack.isNotEmpty()) {
            redoStack.add(currentDrawingState)
            currentDrawingState = undoStack.removeAt(undoStack.lastIndex)
            redrawAllStrokes()
            Toast.makeText(this, R.string.toast_undo, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, R.string.toast_nothing_to_undo, Toast.LENGTH_SHORT).show()
        }
    }

    private fun redo() {
        if (redoStack.isNotEmpty()) {
            saveStateForUndo()
            currentDrawingState = redoStack.removeAt(redoStack.lastIndex)
            redrawAllStrokes()
            Toast.makeText(this, R.string.toast_redo, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, R.string.toast_nothing_to_redo, Toast.LENGTH_SHORT).show()
        }
    }

    private fun redrawAllStrokes() {
    }

    private fun clearDrawing() {
        saveStateForUndo()
        currentDrawingState = currentDrawingState.clear()
        Toast.makeText(this, R.string.toast_cleared, Toast.LENGTH_SHORT).show()
    }

    private fun showDrawingTools() {
        binding.drawingToolbar.root.visibility = if (binding.drawingToolbar.root.visibility == View.VISIBLE) View.GONE else View.VISIBLE
    }

    private fun showColorPicker() {
        ColorPickerBottomSheet().show(supportFragmentManager, "color_picker")
    }

    private fun showBrushSizePicker() {
        BrushSizeBottomSheet().show(supportFragmentManager, "brush_size")
    }

    private fun showGuideSelector() {
        GuideSelectorBottomSheet().show(supportFragmentManager, "guide_selector")
    }

    private fun showLessonSelector() {
        LessonSelectorBottomSheet().show(supportFragmentManager, "lesson_selector")
    }

    private fun showSettings() {
        SettingsDialog().show(supportFragmentManager, "settings")
    }

    private fun showClearConfirmDialog() {
        AlertDialog.Builder(this)
            .setTitle(R.string.dialog_clear_title)
            .setMessage(R.string.dialog_clear_message)
            .setPositiveButton(R.string.dialog_clear_confirm) { _, _ ->
                clearDrawing()
            }
            .setNegativeButton(R.string.dialog_clear_cancel, null)
            .show()
    }

    private fun showSaveDialog() {
        SaveDrawingDialog().show(supportFragmentManager, "save_drawing")
    }

    private fun saveDrawing(name: String) {
        scope.launch {
            val bitmap = captureDrawing()
            val imagePath = saveBitmapToFile(bitmap)
            val thumbnailPath = saveBitmapToFile(createThumbnail(bitmap))

            val drawing = DrawingEntity(
                name = name,
                timestamp = System.currentTimeMillis(),
                imagePath = imagePath,
                thumbnailPath = thumbnailPath,
                strokeData = Gson().toJson(currentDrawingState.strokes.map { it.toStrokeData() }),
                lessonId = currentLesson?.id
            )

            viewModel.insertDrawing(drawing)
            runOnUiThread { Toast.makeText(this@MainActivity, R.string.toast_saved, Toast.LENGTH_SHORT).show() }
        }
    }

    private fun captureDrawing(): Bitmap {
        return Bitmap.createBitmap(arSceneView.width, arSceneView.height, Bitmap.Config.ARGB_8888)
    }

    private fun saveBitmapToFile(bitmap: Bitmap): String {
        val dir = File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), "ARDrawing")
        dir.mkdirs()
        val file = File(dir, "drawing_${System.currentTimeMillis()}.png")
        FileOutputStream(file).use { out ->
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
        }
        return file.absolutePath
    }

    private fun createThumbnail(bitmap: Bitmap): Bitmap {
        return Bitmap.createScaledBitmap(bitmap, 200, 200, true)
    }

    private fun openGallery() {
        Toast.makeText(this, "Gallery coming soon", Toast.LENGTH_SHORT).show()
    }

    private fun showTutorial() {
    }

    private fun showLessonHint() {
        currentLesson?.steps?.getOrNull(currentLessonProgress?.currentStep ?: 0)?.let { step ->
            Toast.makeText(this, step.instruction, Toast.LENGTH_LONG).show()
        }
    }

    private fun updateLessonProgress() {
        currentLessonProgress?.let { progress ->
            val stepIndex = progress.currentStep
            progress.completeStep(stepIndex)

            val lesson = currentLesson!!
            if (progress.currentStep >= lesson.steps.size - 1) {
                completeLesson()
            } else {
                progress.currentStep++
                showLessonHint()
            }

            scope.launch {
                viewModel.updateLessonProgress(progress)
            }
        }
    }

    private fun completeLesson() {
        currentLesson?.let { lesson ->
            val updatedLesson = lesson.copy(isCompleted = true, progress = 1f)
            scope.launch {
                viewModel.updateLesson(updatedLesson)
                unlockNextLesson(lesson)
            }
            Toast.makeText(this, R.string.toast_lesson_completed, Toast.LENGTH_LONG).show()
        }
    }

    private fun unlockNextLesson(completedLesson: Lesson) {
    }

    private fun updateFPS() {
        frameCount++
        val now = System.currentTimeMillis()
        if (now - lastFrameTime >= 1000) {
            val fps = frameCount * 1000 / (now - lastFrameTime)
            if (drawingSettings.showFPS) {
                runOnUiThread {
                    binding.toolbar.subtitle = "FPS: $fps"
                }
            }
            frameCount = 0
            lastFrameTime = now
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 100 && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            arFragment.onResume()
        }
    }

    private fun showPermissionDeniedDialog() {
        AlertDialog.Builder(this)
            .setTitle(R.string.ar_required_permission)
            .setMessage(R.string.permission_rationale)
            .setPositiveButton(android.R.string.ok) { _, _ ->
                finish()
            }
            .setCancelable(false)
            .show()
    }

    override fun onResume() {
        super.onResume()
        arFragment.onResume()
    }

    override fun onPause() {
        super.onPause()
        arFragment.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
