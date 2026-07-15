package com.ardrawing.ardrawing.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ardrawing.ardrawing.data.DrawingEntity
import com.ardrawing.ardrawing.data.LessonEntity
import com.ardrawing.ardrawing.data.LessonProgressEntity
import com.ardrawing.ardrawing.data.SettingEntity
import com.ardrawing.ardrawing.data.StrokeEntity
import com.ardrawing.ardrawing.drawing.DrawingMode
import com.ardrawing.ardrawing.drawing.DrawingSettings
import com.ardrawing.ardrawing.drawing.Lesson
import com.ardrawing.ardrawing.drawing.LessonProgress
import com.ardrawing.ardrawing.drawing.ToolType
import com.ardrawing.ardrawing.util.StrokeData
import com.ardrawing.ardrawing.repository.DrawingRepository
import com.ardrawing.ardrawing.repository.DrawingRepositoryImpl
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DrawingViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: DrawingRepository = DrawingRepositoryImpl(application)

    val allDrawings: LiveData<List<DrawingEntity>> = repository.getAllDrawings()
    val allLessons: LiveData<List<LessonEntity>> = repository.getAllLessons()
    val allLessonProgress: LiveData<List<LessonProgressEntity>> = repository.getAllLessonProgress()
    val allSettings: LiveData<List<SettingEntity>> = repository.getAllSettings()

    private val _currentSettings = MutableLiveData<DrawingSettings>()
    val currentSettings: LiveData<DrawingSettings> = _currentSettings

    init {
        loadSettings()
        repository.initializeDefaultLessons()
    }

    private fun loadSettings() {
        viewModelScope.launch {
            val settings = DrawingSettings()
            settings.brushSize = repository.getSetting("brush_size")?.toFloatOrNull() ?: 8f
            settings.brushOpacity = repository.getSetting("brush_opacity")?.toFloatOrNull() ?: 1f
            settings.brushHardness = repository.getSetting("brush_hardness")?.toFloatOrNull() ?: 0.8f
            settings.brushSmoothing = repository.getSetting("brush_smoothing")?.toFloatOrNull() ?: 0.5f
            settings.currentColor = repository.getSetting("current_color")?.toIntOrNull() ?: 0xFF6750A4.toInt()
            settings.currentTool = when (repository.getSetting("current_tool")?.toIntOrNull() ?: 0) {
                0 -> ToolType.BRUSH
                1 -> ToolType.ERASER
                2 -> ToolType.SHAPE
                3 -> ToolType.TEXT
                4 -> ToolType.EYEDROPPER
                5 -> ToolType.FILL
                else -> ToolType.BRUSH
            }
            settings.guideOpacity = repository.getSetting("guide_opacity")?.toFloatOrNull() ?: 0.6f
            settings.showBrushPreview = repository.getSetting("show_brush_preview")?.toBoolean() ?: true
            settings.autoSave = repository.getSetting("auto_save")?.toBoolean() ?: true
            settings.hapticFeedback = repository.getSetting("haptic_feedback")?.toBoolean() ?: true
            settings.showFPS = repository.getSetting("show_fps")?.toBoolean() ?: false
            settings.planeDetectionEnabled = repository.getSetting("plane_detection")?.toBoolean() ?: true
            settings.drawingPlaneHeight = repository.getSetting("drawing_plane_height")?.toFloatOrNull() ?: 0.5f
            settings.autoRotateCanvas = repository.getSetting("auto_rotate_canvas")?.toBoolean() ?: false
            settings.showLessonHints = repository.getSetting("lesson_hints")?.toBoolean() ?: true
            settings.drawingMode = DrawingMode.entries.getOrElse(repository.getSetting("drawing_mode")?.toIntOrNull() ?: 0) { DrawingMode.FREEHAND }
            settings.arLightingEstimation = repository.getSetting("ar_lighting")?.toBoolean() ?: true
            _currentSettings.postValue(settings)
        }
    }

    fun insertDrawing(drawing: DrawingEntity) {
        viewModelScope.launch {
            repository.insertDrawing(drawing)
        }
    }

    fun updateDrawing(drawing: DrawingEntity) {
        viewModelScope.launch {
            repository.updateDrawing(drawing)
        }
    }

    fun deleteDrawing(drawing: DrawingEntity) {
        viewModelScope.launch {
            repository.deleteDrawing(drawing)
        }
    }

    fun insertLessons(lessons: List<LessonEntity>) {
        viewModelScope.launch {
            repository.insertLessons(lessons)
        }
    }

    fun updateLesson(lesson: Lesson) {
        viewModelScope.launch {
            val entity = LessonEntity(
                id = lesson.id,
                title = lesson.title,
                description = lesson.description,
                category = lesson.category,
                stepsJson = Gson().toJson(lesson.steps),
                difficulty = lesson.difficulty,
                isUnlocked = lesson.isUnlocked,
                isCompleted = lesson.isCompleted,
                progress = lesson.progress,
                thumbnailResource = lesson.thumbnailResource
            )
            repository.updateLesson(entity)
        }
    }

    fun updateLessonProgress(progress: LessonProgress) {
        viewModelScope.launch {
            val entity = LessonProgressEntity(
                lessonId = progress.lessonId,
                currentStep = progress.currentStep,
                completedSteps = Gson().toJson(progress.completedSteps),
                totalTimeSpent = progress.totalTimeSpent,
                lastAccessed = progress.lastAccessed
            )
            repository.updateLessonProgress(entity)
        }
    }

    suspend fun getLessonProgress(lessonId: String): LessonProgress? {
        return try {
            val entity = repository.getLessonProgress(lessonId)
            entity?.let {
                val completedStepsType = object : TypeToken<List<Int>>() {}.type
                LessonProgress(
                    lessonId = it.lessonId,
                    currentStep = it.currentStep,
                    completedSteps = Gson().fromJson(it.completedSteps, completedStepsType),
                    totalTimeSpent = it.totalTimeSpent,
                    lastAccessed = it.lastAccessed
                )
            }
        } catch (e: Exception) {
            null
        }
    }

    fun insertStroke(stroke: StrokeData) {
        viewModelScope.launch {
            val entity = StrokeEntity(
                drawingId = 0,
                pointsJson = Gson().toJson(stroke.points),
                color = stroke.color,
                brushSize = stroke.brushSize,
                opacity = stroke.opacity,
                timestamp = System.currentTimeMillis()
            )
            repository.insertStroke(entity)
        }
    }

    fun updateSetting(key: String, value: String) {
        viewModelScope.launch {
            repository.setSetting(key, value)
        }
        val settings = _currentSettings.value ?: return

        applySetting(settings, key, value)
        _currentSettings.postValue(settings)
    }

    private fun applySetting(settings: DrawingSettings, key: String, value: String) {
        when (key) {
            "brush_size" -> settings.brushSize = value.toFloatOrNull() ?: 8f
            "brush_opacity" -> settings.brushOpacity = value.toFloatOrNull() ?: 1f
            "brush_hardness" -> settings.brushHardness = value.toFloatOrNull() ?: 0.8f
            "brush_smoothing" -> settings.brushSmoothing = value.toFloatOrNull() ?: 0.5f
            "current_color" -> settings.currentColor = value.toIntOrNull() ?: 0xFF6750A4.toInt()
            "current_tool" -> settings.currentTool = ToolType.entries.getOrElse(value.toIntOrNull() ?: 0) { ToolType.BRUSH }
            "guide_opacity" -> settings.guideOpacity = value.toFloatOrNull() ?: 0.6f
            "show_brush_preview" -> settings.showBrushPreview = value.toBoolean()
            "auto_save" -> settings.autoSave = value.toBoolean()
            "haptic_feedback" -> settings.hapticFeedback = value.toBoolean()
            "show_fps" -> settings.showFPS = value.toBoolean()
            "plane_detection" -> settings.planeDetectionEnabled = value.toBoolean()
            "drawing_plane_height" -> settings.drawingPlaneHeight = value.toFloatOrNull() ?: 0.5f
            "auto_rotate_canvas" -> settings.autoRotateCanvas = value.toBoolean()
            "lesson_hints" -> settings.showLessonHints = value.toBoolean()
            "drawing_mode" -> settings.drawingMode = DrawingMode.entries.getOrElse(value.toIntOrNull() ?: 0) { DrawingMode.FREEHAND }
            "ar_lighting" -> settings.arLightingEstimation = value.toBoolean()
        }
    }

    suspend fun getSetting(key: String): String? {
        return withContext(Dispatchers.IO) {
            repository.getSetting(key)
        }
    }

    fun exportDrawing(drawing: DrawingEntity): String {
        return Gson().toJson(drawing)
    }

    fun importDrawing(json: String): DrawingEntity? {
        return try {
            Gson().fromJson(json, DrawingEntity::class.java)
        } catch (e: Exception) {
            null
        }
    }
}
