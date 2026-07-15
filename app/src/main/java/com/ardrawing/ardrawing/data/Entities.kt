package com.ardrawing.ardrawing.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.ardrawing.ardrawing.util.Converters

@Entity(tableName = "drawings")
@TypeConverters(Converters::class)
data class DrawingEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val timestamp: Long,
    val imagePath: String,
    val thumbnailPath: String?,
    val strokeData: String,
    val lessonId: String? = null,
    val isCompleted: Boolean = false
)

@Entity(tableName = "lessons")
data class LessonEntity(
    @PrimaryKey val id: String,
    val title: String,
    val description: String,
    val category: String,
    val stepsJson: String,
    val difficulty: Int,
    val isUnlocked: Boolean = false,
    val isCompleted: Boolean = false,
    val progress: Float = 0f,
    val thumbnailResource: Int = 0
)

@Entity(tableName = "lesson_progress")
data class LessonProgressEntity(
    @PrimaryKey val lessonId: String,
    val currentStep: Int = 0,
    val completedSteps: String,
    val totalTimeSpent: Long = 0,
    val lastAccessed: Long = System.currentTimeMillis()
)

@Entity(tableName = "settings")
data class SettingEntity(
    @PrimaryKey val key: String,
    val value: String
)

@Entity(tableName = "drawing_strokes")
@TypeConverters(Converters::class)
data class StrokeEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val drawingId: Long,
    val pointsJson: String,
    val color: Int,
    val brushSize: Float,
    val opacity: Float,
    val timestamp: Long
)