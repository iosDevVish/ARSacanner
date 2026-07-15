package com.ardrawing.ardrawing.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import kotlinx.coroutines.flow.Flow

@Dao
interface DrawingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(drawing: DrawingEntity): Long

    @Update
    suspend fun update(drawing: DrawingEntity)

    @Delete
    suspend fun delete(drawing: DrawingEntity)

    @Query("SELECT * FROM drawings ORDER BY timestamp DESC")
    fun getAllDrawings(): Flow<List<DrawingEntity>>

    @Query("SELECT * FROM drawings WHERE lessonId = :lessonId ORDER BY timestamp DESC")
    fun getDrawingsByLesson(lessonId: String): Flow<List<DrawingEntity>>

    @Query("SELECT * FROM drawings WHERE id = :id")
    suspend fun getDrawingById(id: Long): DrawingEntity?

    @Query("DELETE FROM drawings WHERE id = :id")
    suspend fun deleteById(id: Long)
}

@Dao
interface LessonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(lessons: List<LessonEntity>)

    @Update
    suspend fun update(lesson: LessonEntity)

    @Query("SELECT * FROM lessons ORDER BY category, difficulty")
    fun getAllLessons(): Flow<List<LessonEntity>>

    @Query("SELECT * FROM lessons WHERE category = :category ORDER BY difficulty")
    fun getLessonsByCategory(category: String): Flow<List<LessonEntity>>

    @Query("SELECT * FROM lessons WHERE id = :id")
    suspend fun getLessonById(id: String): LessonEntity?

    @Query("SELECT * FROM lessons WHERE isUnlocked = 1 ORDER BY category, difficulty")
    fun getUnlockedLessons(): Flow<List<LessonEntity>>
}

@Dao
interface LessonProgressDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(progress: LessonProgressEntity)

    @Update
    suspend fun update(progress: LessonProgressEntity)

    @Query("SELECT * FROM lesson_progress WHERE lessonId = :lessonId")
    suspend fun getProgress(lessonId: String): LessonProgressEntity?

    @Query("SELECT * FROM lesson_progress")
    fun getAllProgress(): Flow<List<LessonProgressEntity>>
}

@Dao
interface SettingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(setting: SettingEntity)

    @Query("SELECT value FROM settings WHERE key = :key")
    suspend fun getValue(key: String): String?

    @Query("SELECT * FROM settings")
    fun getAllSettings(): Flow<List<SettingEntity>>

    @Delete
    suspend fun delete(setting: SettingEntity)
}

@Dao
interface StrokeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(strokes: List<StrokeEntity>)

    @Query("SELECT * FROM drawing_strokes WHERE drawingId = :drawingId ORDER BY timestamp")
    suspend fun getStrokesByDrawing(drawingId: Long): List<StrokeEntity>

    @Query("DELETE FROM drawing_strokes WHERE drawingId = :drawingId")
    suspend fun deleteByDrawingId(drawingId: Long)
}