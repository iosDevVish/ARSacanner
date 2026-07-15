package com.ardrawing.ardrawing.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ardrawing.ardrawing.util.Converters

@Database(
    entities = [
        DrawingEntity::class,
        LessonEntity::class,
        LessonProgressEntity::class,
        SettingEntity::class,
        StrokeEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun drawingDao(): DrawingDao
    abstract fun lessonDao(): LessonDao
    abstract fun lessonProgressDao(): LessonProgressDao
    abstract fun settingDao(): SettingDao
    abstract fun strokeDao(): StrokeDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "ardrawing_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}