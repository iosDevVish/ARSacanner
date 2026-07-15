package com.ardrawing.ardrawing.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.ardrawing.ardrawing.data.AppDatabase
import com.ardrawing.ardrawing.data.DrawingEntity
import com.ardrawing.ardrawing.data.LessonEntity
import com.ardrawing.ardrawing.data.LessonProgressEntity
import com.ardrawing.ardrawing.data.SettingEntity
import com.ardrawing.ardrawing.data.StrokeEntity
import com.ardrawing.ardrawing.drawing.DrawingSettings
import com.ardrawing.ardrawing.drawing.Lesson
import com.ardrawing.ardrawing.drawing.LessonProgress
import com.ardrawing.ardrawing.drawing.LessonStep
import com.ardrawing.ardrawing.util.Point3D
import com.ardrawing.ardrawing.util.StrokeData
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DrawingRepositoryImpl(private val application: Application) : DrawingRepository {
    private val appDatabase = AppDatabase.getDatabase(application)
    private val drawingDao = appDatabase.drawingDao()
    private val lessonDao = appDatabase.lessonDao()
    private val lessonProgressDao = appDatabase.lessonProgressDao()
    private val settingDao = appDatabase.settingDao()
    private val strokeDao = appDatabase.strokeDao()
    private val scope = CoroutineScope(Dispatchers.IO)
    private val gson = Gson()

    override suspend fun insertDrawing(drawing: DrawingEntity): Long {
        return drawingDao.insert(drawing)
    }

    override suspend fun updateDrawing(drawing: DrawingEntity) {
        drawingDao.update(drawing)
    }

    override suspend fun deleteDrawing(drawing: DrawingEntity) {
        drawingDao.delete(drawing)
    }

    override fun getAllDrawings(): LiveData<List<DrawingEntity>> {
        return drawingDao.getAllDrawings().asLiveData()
    }

    override suspend fun insertLessons(lessons: List<LessonEntity>) {
        lessonDao.insertAll(lessons)
    }

    override suspend fun updateLesson(lesson: LessonEntity) {
        lessonDao.update(lesson)
    }

    override fun getAllLessons(): LiveData<List<LessonEntity>> {
        return lessonDao.getAllLessons().asLiveData()
    }

    override fun getLessonsByCategory(category: String): LiveData<List<LessonEntity>> {
        return lessonDao.getLessonsByCategory(category).asLiveData()
    }

    override suspend fun getLessonById(id: String): LessonEntity? {
        return lessonDao.getLessonById(id)
    }

    override fun getUnlockedLessons(): LiveData<List<LessonEntity>> {
        return lessonDao.getUnlockedLessons().asLiveData()
    }

    override suspend fun updateLessonProgress(progress: LessonProgressEntity) {
        lessonProgressDao.insert(progress)
    }

    override suspend fun getLessonProgress(lessonId: String): LessonProgressEntity? {
        return lessonProgressDao.getProgress(lessonId)
    }

    override fun getAllLessonProgress(): LiveData<List<LessonProgressEntity>> {
        return lessonProgressDao.getAllProgress().asLiveData()
    }

    override suspend fun insertStrokes(strokes: List<StrokeEntity>) {
        strokeDao.insertAll(strokes)
    }

    override suspend fun insertStroke(stroke: StrokeEntity) {
        strokeDao.insertAll(listOf(stroke))
    }

    override suspend fun getStrokesByDrawing(drawingId: Long): List<StrokeEntity> {
        return strokeDao.getStrokesByDrawing(drawingId)
    }

    override suspend fun deleteStrokesByDrawing(drawingId: Long) {
        strokeDao.deleteByDrawingId(drawingId)
    }

    override suspend fun getSetting(key: String): String? {
        return settingDao.getValue(key)
    }

    override suspend fun setSetting(key: String, value: String) {
        settingDao.insert(SettingEntity(key, value))
    }

    override fun getAllSettings(): LiveData<List<SettingEntity>> {
        return settingDao.getAllSettings().asLiveData()
    }

    override fun initializeDefaultLessons() {
        scope.launch {
            val existingLessons = lessonDao.getAllLessons().first()
            if (existingLessons.isEmpty()) {
                val defaultLessons = createDefaultLessons()
                lessonDao.insertAll(defaultLessons)
            }
        }
    }

    private fun createDefaultLessons(): List<LessonEntity> {
        val steps = listOf(
            LessonStep("Circle", "Draw a perfect circle", "circle", listOf(
                Point3D(0f, 0f, 0f, 1f), Point3D(0.5f, 0f, 0f, 1f), Point3D(0.5f, 0.5f, 0f, 1f),
                Point3D(0f, 0.5f, 0f, 1f), Point3D(-0.5f, 0.5f, 0f, 1f), Point3D(-0.5f, 0f, 0f, 1f),
                Point3D(-0.5f, -0.5f, 0f, 1f), Point3D(0f, -0.5f, 0f, 1f), Point3D(0.5f, -0.5f, 0f, 1f),
                Point3D(0.5f, 0f, 0f, 1f)
            )),
            LessonStep("Square", "Draw a square with straight lines", "square", listOf(
                Point3D(-0.5f, -0.5f, 0f, 1f), Point3D(0.5f, -0.5f, 0f, 1f), Point3D(0.5f, 0.5f, 0f, 1f),
                Point3D(-0.5f, 0.5f, 0f, 1f), Point3D(-0.5f, -0.5f, 0f, 1f)
            )),
            LessonStep("Triangle", "Draw an equilateral triangle", "triangle", listOf(
                Point3D(0f, 0.5f, 0f, 1f), Point3D(-0.43f, -0.25f, 0f, 1f), Point3D(0.43f, -0.25f, 0f, 1f),
                Point3D(0f, 0.5f, 0f, 1f)
            )),
            LessonStep("Rectangle", "Draw a rectangle", "rectangle", listOf(
                Point3D(-0.7f, -0.4f, 0f, 1f), Point3D(0.7f, -0.4f, 0f, 1f), Point3D(0.7f, 0.4f, 0f, 1f),
                Point3D(-0.7f, 0.4f, 0f, 1f), Point3D(-0.7f, -0.4f, 0f, 1f)
            )),
            LessonStep("Oval", "Draw an oval shape", "oval", listOf(
                Point3D(0f, 0.4f, 0f, 1f), Point3D(0.4f, 0.2f, 0f, 1f), Point3D(0.6f, 0f, 0f, 1f),
                Point3D(0.4f, -0.2f, 0f, 1f), Point3D(0f, -0.4f, 0f, 1f), Point3D(-0.4f, -0.2f, 0f, 1f),
                Point3D(-0.6f, 0f, 0f, 1f), Point3D(-0.4f, 0.2f, 0f, 1f), Point3D(0f, 0.4f, 0f, 1f)
            ))
        )

        return listOf(
            LessonEntity(
                id = "basic_shapes",
                title = "Basic Shapes",
                description = "Learn to draw circles, squares, triangles",
                category = "beginner",
                stepsJson = gson.toJson(steps),
                difficulty = 1,
                isUnlocked = true,
                thumbnailResource = 0
            ),
            LessonEntity(
                id = "letters_numbers",
                title = "Letters & Numbers",
                description = "Practice writing letters and numbers",
                category = "beginner",
                stepsJson = gson.toJson(listOf(
                    LessonStep("Letter A", "Draw uppercase A", "letter_a", listOf(
                        Point3D(-0.4f, -0.5f, 0f, 1f), Point3D(0f, 0.5f, 0f, 1f), Point3D(0.4f, -0.5f, 0f, 1f),
                        Point3D(-0.2f, 0f, 0f, 1f), Point3D(0.2f, 0f, 0f, 1f)
                    )),
                    LessonStep("Letter B", "Draw uppercase B", "letter_b", listOf(
                        Point3D(-0.4f, -0.5f, 0f, 1f), Point3D(-0.4f, 0.5f, 0f, 1f), Point3D(-0.2f, 0.5f, 0f, 1f),
                        Point3D(0.2f, 0.3f, 0f, 1f), Point3D(-0.2f, 0f, 0f, 1f), Point3D(0.2f, -0.3f, 0f, 1f),
                        Point3D(-0.2f, -0.5f, 0f, 1f)
                    )),
                    LessonStep("Number 1", "Draw number 1", "number_1", listOf(
                        Point3D(0f, 0.5f, 0f, 1f), Point3D(0f, -0.5f, 0f, 1f)
                    )),
                    LessonStep("Number 2", "Draw number 2", "number_2", listOf(
                        Point3D(0.4f, 0.5f, 0f, 1f), Point3D(-0.4f, 0.5f, 0f, 1f), Point3D(-0.4f, 0f, 0f, 1f),
                        Point3D(0.4f, 0f, 0f, 1f), Point3D(0.4f, -0.5f, 0f, 1f), Point3D(-0.4f, -0.5f, 0f, 1f)
                    ))
                )),
                difficulty = 2,
                isUnlocked = false,
                thumbnailResource = 0
            ),
            LessonEntity(
                id = "animals",
                title = "Simple Animals",
                description = "Draw cute animals step by step",
                category = "intermediate",
                stepsJson = gson.toJson(listOf(
                    LessonStep("Cat Face", "Draw a cute cat face", "cat", listOf(
                        Point3D(0f, 0.3f, 0f, 1f), Point3D(-0.3f, 0.3f, 0f, 1f), Point3D(-0.3f, -0.3f, 0f, 1f),
                        Point3D(0.3f, -0.3f, 0f, 1f), Point3D(0.3f, 0.3f, 0f, 1f), Point3D(0f, 0.3f, 0f, 1f),
                        Point3D(-0.15f, 0.1f, 0f, 1f), Point3D(0.15f, 0.1f, 0f, 1f), Point3D(0f, -0.1f, 0f, 1f),
                        Point3D(-0.15f, -0.15f, 0f, 1f), Point3D(0.15f, -0.15f, 0f, 1f)
                    )),
                    LessonStep("Fish", "Draw a simple fish", "fish", listOf(
                        Point3D(-0.5f, 0f, 0f, 1f), Point3D(0f, 0.3f, 0f, 1f), Point3D(0.5f, 0f, 0f, 1f),
                        Point3D(0f, -0.3f, 0f, 1f), Point3D(-0.5f, 0f, 0f, 1f), Point3D(0.3f, 0f, 0f, 1f),
                        Point3D(0.5f, 0.1f, 0f, 1f), Point3D(0.5f, -0.1f, 0f, 1f)
                    )),
                    LessonStep("Bird", "Draw a bird in flight", "bird", listOf(
                        Point3D(-0.4f, 0f, 0f, 1f), Point3D(0f, 0.3f, 0f, 1f), Point3D(0.4f, 0f, 0f, 1f),
                        Point3D(0f, -0.2f, 0f, 1f), Point3D(-0.2f, 0.1f, 0f, 1f), Point3D(0.2f, 0.1f, 0f, 1f)
                    ))
                )),
                difficulty = 3,
                isUnlocked = false,
                thumbnailResource = 0
            ),
            LessonEntity(
                id = "nature",
                title = "Nature Elements",
                description = "Draw trees, flowers, clouds",
                category = "intermediate",
                stepsJson = gson.toJson(listOf(
                    LessonStep("Tree", "Draw a simple tree", "tree", listOf(
                        Point3D(0f, -0.5f, 0f, 1f), Point3D(0f, 0f, 0f, 1f), Point3D(-0.4f, 0.4f, 0f, 1f),
                        Point3D(0f, 0.6f, 0f, 1f), Point3D(0.4f, 0.4f, 0f, 1f), Point3D(0f, 0f, 0f, 1f)
                    )),
                    LessonStep("Flower", "Draw a flower", "flower", listOf(
                        Point3D(0f, 0f, 0f, 1f), Point3D(0f, 0.4f, 0f, 1f), Point3D(-0.3f, 0.2f, 0f, 1f),
                        Point3D(0f, 0f, 0f, 1f), Point3D(0.3f, 0.2f, 0f, 1f), Point3D(0f, 0f, 0f, 1f),
                        Point3D(0.2f, -0.3f, 0f, 1f), Point3D(0f, 0f, 0f, 1f), Point3D(-0.2f, -0.3f, 0f, 1f)
                    )),
                    LessonStep("Cloud", "Draw a fluffy cloud", "cloud", listOf(
                        Point3D(-0.5f, 0.2f, 0f, 1f), Point3D(-0.3f, 0.5f, 0f, 1f), Point3D(0f, 0.6f, 0f, 1f),
                        Point3D(0.3f, 0.5f, 0f, 1f), Point3D(0.5f, 0.2f, 0f, 1f), Point3D(0.3f, -0.1f, 0f, 1f),
                        Point3D(0f, -0.2f, 0f, 1f), Point3D(-0.3f, -0.1f, 0f, 1f), Point3D(-0.5f, 0.2f, 0f, 1f)
                    ))
                )),
                difficulty = 3,
                isUnlocked = false,
                thumbnailResource = 0
            ),
            LessonEntity(
                id = "faces",
                title = "Simple Faces",
                description = "Draw faces and expressions",
                category = "intermediate",
                stepsJson = gson.toJson(listOf(
                    LessonStep("Happy Face", "Draw a happy face", "happy", listOf(
                        Point3D(0f, 0.4f, 0f, 1f), Point3D(-0.3f, 0.4f, 0f, 1f), Point3D(-0.3f, -0.4f, 0f, 1f),
                        Point3D(0.3f, -0.4f, 0f, 1f), Point3D(0.3f, 0.4f, 0f, 1f), Point3D(0f, 0.4f, 0f, 1f),
                        Point3D(-0.15f, 0.1f, 0f, 1f), Point3D(0.15f, 0.1f, 0f, 1f), Point3D(0f, -0.1f, 0f, 1f),
                        Point3D(-0.2f, -0.2f, 0f, 1f), Point3D(0.2f, -0.2f, 0f, 1f)
                    )),
                    LessonStep("Sad Face", "Draw a sad face", "sad", listOf(
                        Point3D(0f, 0.4f, 0f, 1f), Point3D(-0.3f, 0.4f, 0f, 1f), Point3D(-0.3f, -0.4f, 0f, 1f),
                        Point3D(0.3f, -0.4f, 0f, 1f), Point3D(0.3f, 0.4f, 0f, 1f), Point3D(0f, 0.4f, 0f, 1f),
                        Point3D(-0.15f, 0f, 0f, 1f), Point3D(0.15f, 0f, 0f, 1f), Point3D(0f, -0.2f, 0f, 1f),
                        Point3D(-0.2f, -0.1f, 0f, 1f), Point3D(0.2f, -0.1f, 0f, 1f)
                    ))
                )),
                difficulty = 3,
                isUnlocked = false,
                thumbnailResource = 0
            ),
            LessonEntity(
                id = "objects",
                title = "Everyday Objects",
                description = "Draw cups, books, chairs",
                category = "advanced",
                stepsJson = gson.toJson(listOf(
                    LessonStep("Cup", "Draw a coffee cup", "cup", listOf(
                        Point3D(-0.3f, -0.5f, 0f, 1f), Point3D(-0.3f, 0.5f, 0f, 1f), Point3D(0.3f, 0.5f, 0f, 1f),
                        Point3D(0.3f, -0.5f, 0f, 1f), Point3D(-0.3f, -0.5f, 0f, 1f), Point3D(-0.4f, 0.3f, 0f, 1f),
                        Point3D(-0.6f, 0.3f, 0f, 1f), Point3D(-0.6f, -0.1f, 0f, 1f), Point3D(-0.4f, -0.1f, 0f, 1f)
                    )),
                    LessonStep("Book", "Draw an open book", "book", listOf(
                        Point3D(-0.5f, -0.4f, 0f, 1f), Point3D(0f, -0.4f, 0f, 1f), Point3D(0f, 0.4f, 0f, 1f),
                        Point3D(-0.5f, 0.4f, 0f, 1f), Point3D(-0.5f, -0.4f, 0f, 1f), Point3D(0.5f, -0.4f, 0f, 1f),
                        Point3D(0.5f, 0.4f, 0f, 1f), Point3D(0f, 0.4f, 0f, 1f)
                    )),
                    LessonStep("House", "Draw a simple house", "house", listOf(
                        Point3D(-0.5f, -0.3f, 0f, 1f), Point3D(0.5f, -0.3f, 0f, 1f), Point3D(0.5f, 0.3f, 0f, 1f),
                        Point3D(0f, 0.6f, 0f, 1f), Point3D(-0.5f, 0.3f, 0f, 1f), Point3D(-0.5f, -0.3f, 0f, 1f),
                        Point3D(-0.2f, -0.3f, 0f, 1f), Point3D(-0.2f, 0.1f, 0f, 1f), Point3D(0.2f, 0.1f, 0f, 1f),
                        Point3D(0.2f, -0.3f, 0f, 1f)
                    ))
                )),
                difficulty = 4,
                isUnlocked = false,
                thumbnailResource = 0
            )
        )
    }
}