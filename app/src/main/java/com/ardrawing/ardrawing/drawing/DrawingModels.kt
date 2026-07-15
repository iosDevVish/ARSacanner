package com.ardrawing.ardrawing.drawing

import android.graphics.Color
import com.ardrawing.ardrawing.R
import com.ardrawing.ardrawing.util.Point3D
import com.ardrawing.ardrawing.util.StrokeData
import com.google.gson.annotations.SerializedName

data class DrawingStroke(
    val points: List<Point3D>,
    val color: Int,
    val brushSize: Float,
    val opacity: Float,
    val toolType: ToolType
) {
    fun toStrokeData(): StrokeData {
        return StrokeData(
            points = points,
            color = color,
            brushSize = brushSize,
            opacity = opacity,
            toolType = toolType.id
        )
    }
}

sealed class DrawingGuide(val id: String, val name: String, val description: String, val iconRes: Int) {
    object GRID : DrawingGuide("grid", "Grid", "Show grid for proportion", R.drawable.ic_grid_on)
    object PERSPECTIVE : DrawingGuide("perspective", "Perspective", "Perspective guidelines", R.drawable.ic_perspective)
    object CIRCLE : DrawingGuide("circle", "Circle Guide", "Perfect circle guide", R.drawable.ic_circle)
    object LINE : DrawingGuide("line", "Straight Line", "Straight line guide", R.drawable.ic_line)
    object SYMMETRY : DrawingGuide("symmetry", "Symmetry", "Mirror drawing", R.drawable.ic_symmetry)
    object PERSPECTIVE_GRID : DrawingGuide("perspective_grid", "Perspective Grid", "3D perspective grid", R.drawable.ic_perspective_grid)
    object ISOMETRIC : DrawingGuide("isometric", "Isometric", "Isometric grid", R.drawable.ic_isometric)
    object GOLDEN_RATIO : DrawingGuide("golden_ratio", "Golden Ratio", "Golden ratio guide", R.drawable.ic_golden_ratio)
    object RULE_OF_THIRDS : DrawingGuide("rule_of_thirds", "Rule of Thirds", "Composition guide", R.drawable.ic_rule_of_thirds)
    object SPIRAL : DrawingGuide("spiral", "Spiral", "Fibonacci spiral guide", R.drawable.ic_spiral)

    companion object {
        val ALL = listOf(GRID, PERSPECTIVE, CIRCLE, LINE, SYMMETRY, PERSPECTIVE_GRID, ISOMETRIC, GOLDEN_RATIO, RULE_OF_THIRDS, SPIRAL)
    }
}

sealed class ToolType(val id: Int, val name: String, val iconRes: Int, val cursorRes: Int) {
    object BRUSH : ToolType(0, "Brush", R.drawable.ic_brush, R.drawable.ic_brush)
    object ERASER : ToolType(1, "Eraser", R.drawable.ic_eraser, R.drawable.ic_eraser)
    object SHAPE : ToolType(2, "Shape", R.drawable.ic_shape, R.drawable.ic_shape)
    object TEXT : ToolType(3, "Text", R.drawable.ic_text, R.drawable.ic_text)
    object EYEDROPPER : ToolType(4, "Eyedropper", R.drawable.ic_eyedropper, R.drawable.ic_eyedropper)
    object FILL : ToolType(5, "Fill", R.drawable.ic_fill, R.drawable.ic_fill)

    companion object {
        val entries = listOf(
            BRUSH, ERASER, SHAPE, TEXT, EYEDROPPER, FILL
        )
    }
}

enum class LessonCategory(val id: String, val displayName: String, val iconRes: Int, val colorRes: Int) {
    BEGINNER("beginner", "Beginner", R.drawable.ic_star, R.color.color_primary),
    INTERMEDIATE("intermediate", "Intermediate", R.drawable.ic_star, R.color.color_accent),
    ADVANCED("advanced", "Advanced", R.drawable.ic_star, R.color.secondary)
}

data class Lesson(
    val id: String,
    val title: String,
    val description: String,
    val category: String,
    val difficulty: Int,
    val steps: List<LessonStep>,
    val isUnlocked: Boolean = false,
    val isCompleted: Boolean = false,
    val progress: Float = 0f,
    val thumbnailResource: Int = 0
) {
    fun getCategoryEnum(): LessonCategory {
        return LessonCategory.values().firstOrNull { it.id == category } ?: LessonCategory.BEGINNER
    }
}

data class LessonStep(
    val title: String,
    val instruction: String,
    val shapeType: String,
    val guidePoints: List<Point3D>
)

data class LessonProgress(
    val lessonId: String,
    var currentStep: Int = 0,
    var completedSteps: List<Int> = emptyList(),
    var totalTimeSpent: Long = 0,
    var lastAccessed: Long = System.currentTimeMillis(),
    var bestScore: Int = 0,
    var attempts: Int = 0
) {
    fun getProgress(): Float {
        return if (completedSteps.isEmpty()) 0f else completedSteps.size.toFloat() / 100f
    }

    fun isStepCompleted(stepIndex: Int): Boolean {
        return completedSteps.contains(stepIndex)
    }

    fun completeStep(stepIndex: Int) {
        if (!completedSteps.contains(stepIndex)) {
            completedSteps = completedSteps + stepIndex
        }
    }
}

data class DrawingSession(
    val id: String,
    val lessonId: String?,
    val startTime: Long,
    var endTime: Long? = null,
    var strokesCount: Int = 0,
    var undoCount: Int = 0,
    var redoCount: Int = 0,
    var guidesUsed: List<String> = emptyList(),
    var toolsUsed: List<ToolType> = emptyList()
) {
    fun getDuration(): Long {
        return (endTime ?: System.currentTimeMillis()) - startTime
    }
}

data class DrawingSettings(
    var brushSize: Float = 8f,
    var brushOpacity: Float = 1f,
    var brushHardness: Float = 0.8f,
    var brushSmoothing: Float = 0.5f,
    var currentColor: Int = 0xFF6750A4.toInt(),
    var currentTool: ToolType = ToolType.BRUSH,
    var activeGuide: DrawingGuide? = null,
    var guideOpacity: Float = 0.6f,
    var showBrushPreview: Boolean = true,
    var autoSave: Boolean = true,
    var hapticFeedback: Boolean = true,
    var showFPS: Boolean = false,
    var planeDetectionEnabled: Boolean = true,
    var drawingPlaneHeight: Float = 0.5f,
    var autoRotateCanvas: Boolean = false,
    var showLessonHints: Boolean = true,
    var drawingMode: DrawingMode = DrawingMode.FREEHAND,
    var arLightingEstimation: Boolean = true
)

enum class DrawingMode {
    FREEHAND,
    TRACE_GUIDE,
    STENCIL
}

data class ColorSwatch(
    val color: Int,
    val name: String,
    val isCustom: Boolean = false
)

object DefaultColors {
    val PALETTE = listOf(
        ColorSwatch(0xFF212121.toInt(), "Black"),
        ColorSwatch(0xFFFFFFFF.toInt(), "White"),
        ColorSwatch(0xFFE53935.toInt(), "Red"),
        ColorSwatch(0xFF1E88E5.toInt(), "Blue"),
        ColorSwatch(0xFF43A047.toInt(), "Green"),
        ColorSwatch(0xFFFDD835.toInt(), "Yellow"),
        ColorSwatch(0xFFF4511E.toInt(), "Orange"),
        ColorSwatch(0xFF8E24AA.toInt(), "Purple"),
        ColorSwatch(0xFFD81B60.toInt(), "Pink"),
        ColorSwatch(0xFF6D4C41.toInt(), "Brown"),
        ColorSwatch(0xFF00ACC1.toInt(), "Cyan"),
        ColorSwatch(0xFFC2185B.toInt(), "Magenta"),
        ColorSwatch(0xFFC0CA33.toInt(), "Lime"),
        ColorSwatch(0xFF00897B.toInt(), "Teal"),
        ColorSwatch(0xFF3F51B5.toInt(), "Indigo"),
        ColorSwatch(0xFFFFB300.toInt(), "Amber"),
        ColorSwatch(0xFF757575.toInt(), "Gray"),
        ColorSwatch(0xFFFFF8E1.toInt(), "Cream"),
        ColorSwatch(0xFFE8EAF6.toInt(), "Lavender"),
        ColorSwatch(0xFFE0F2F1.toInt(), "Mint")
    )

    val BRUSH_SIZES = floatArrayOf(1f, 2f, 4f, 8f, 12f, 16f, 24f, 32f, 48f, 64f)
    val OPACITY_VALUES = floatArrayOf(0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f)
}

data class DrawingState(
    val strokes: List<DrawingStroke> = emptyList(),
    val currentStroke: DrawingStroke? = null,
    val currentColor: Int = Color.BLACK,
    val currentBrushSize: Float = 8f,
    val currentOpacity: Float = 1f,
    val currentTool: ToolType = ToolType.BRUSH,
    val selectedGuide: DrawingGuide? = null,
    val canvasPosition: Point3D = Point3D(0f, 0f, -0.5f),
    val canvasRotation: Float = 0f,
    val canvasScale: Float = 1f
) {
    fun withNewStroke(stroke: DrawingStroke): DrawingState {
        return copy(currentStroke = stroke)
    }

    fun addStroke(stroke: DrawingStroke): DrawingState {
        return copy(
            strokes = strokes + stroke,
            currentStroke = null
        )
    }

    fun undo(): DrawingState {
        return if (strokes.isEmpty()) this else copy(strokes = strokes.dropLast(1))
    }

    fun clear(): DrawingState {
        return copy(strokes = emptyList(), currentStroke = null)
    }
}