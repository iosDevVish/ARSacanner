package com.ardrawing.ardrawing.di

import android.content.Context
import androidx.room.Room
import com.ardrawing.ardrawing.data.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "ardrawing_database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}