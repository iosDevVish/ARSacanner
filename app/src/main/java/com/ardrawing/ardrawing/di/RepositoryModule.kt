package com.ardrawing.ardrawing.di

import android.app.Application
import com.ardrawing.ardrawing.repository.DrawingRepository
import com.ardrawing.ardrawing.repository.DrawingRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDrawingRepository(application: Application): DrawingRepository {
        return DrawingRepositoryImpl(application)
    }
}