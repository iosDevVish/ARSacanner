package com.ardrawing.ardrawing.repository

import com.ardrawing.ardrawing.data.AppDatabase
import com.ardrawing.ardrawing.data.DrawingEntity
import com.ardrawing.ardrawing.data.LessonEntity
import com.ardrawing.ardrawing.data.LessonProgressEntity
import com.ardrawing.ardrawing.data.SettingEntity
import com.ardrawing.ardrawing.data.StrokeEntity
import com.ardrawing.ardrawing.drawing.LessonProgress
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface DrawingRepository {
    suspend fun insertDrawing(drawing: DrawingEntity): Long
    suspend fun updateDrawing(drawing: DrawingEntity)
    suspend fun deleteDrawing(drawing: DrawingEntity)
    fun getAllDrawings(): androidx.lifecycle.LiveData<List<DrawingEntity>>

    suspend fun insertLessons(lessons: List<LessonEntity>)
    suspend fun updateLesson(lesson: LessonEntity)
    fun getAllLessons(): androidx.lifecycle.LiveData<List<LessonEntity>>
    fun getLessonsByCategory(category: String): androidx.lifecycle.LiveData<List<LessonEntity>>
    suspend fun getLessonById(id: String): LessonEntity?
    fun getUnlockedLessons(): androidx.lifecycle.LiveData<List<LessonEntity>>

    suspend fun updateLessonProgress(progress: LessonProgressEntity)
    suspend fun getLessonProgress(lessonId: String): LessonProgressEntity?
    fun getAllLessonProgress(): androidx.lifecycle.LiveData<List<LessonProgressEntity>>

    suspend fun insertStrokes(strokes: List<StrokeEntity>)
    suspend fun insertStroke(stroke: StrokeEntity)
    suspend fun getStrokesByDrawing(drawingId: Long): List<StrokeEntity>
    suspend fun deleteStrokesByDrawing(drawingId: Long)

    suspend fun getSetting(key: String): String?
    suspend fun setSetting(key: String, value: String)
    fun getAllSettings(): androidx.lifecycle.LiveData<List<SettingEntity>>

    fun initializeDefaultLessons()
}