package com.ardrawing.ardrawing.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH&J\u001c\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000bH&J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0017H\u00a6@\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000bH&J\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u00a6@\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u0017H\u00a6@\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0\u000bH&J\u001c\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\fH\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010&\u001a\u00020\b2\u0006\u0010\'\u001a\u00020%H\u00a6@\u00a2\u0006\u0002\u0010(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\f2\u0006\u0010*\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010+J\u0018\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020\u0017H\u00a6@\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0017H\u00a6@\u00a2\u0006\u0002\u00101J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\f0\u000bH&J\b\u00104\u001a\u00020\bH&\u00a8\u00065\u00c0\u0006\u0003"}, d2 = {"Lcom/ardrawing/ardrawing/repository/DrawingRepository;", "", "insertDrawing", "", "drawing", "Lcom/ardrawing/ardrawing/data/DrawingEntity;", "(Lcom/ardrawing/ardrawing/data/DrawingEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDrawing", "", "deleteDrawing", "getAllDrawings", "Landroidx/lifecycle/LiveData;", "", "insertLessons", "lessons", "Lcom/ardrawing/ardrawing/data/LessonEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLesson", "lesson", "(Lcom/ardrawing/ardrawing/data/LessonEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLessons", "getLessonsByCategory", "category", "", "getLessonById", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnlockedLessons", "updateLessonProgress", "progress", "Lcom/ardrawing/ardrawing/data/LessonProgressEntity;", "(Lcom/ardrawing/ardrawing/data/LessonProgressEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLessonProgress", "lessonId", "getAllLessonProgress", "insertStrokes", "strokes", "Lcom/ardrawing/ardrawing/data/StrokeEntity;", "insertStroke", "stroke", "(Lcom/ardrawing/ardrawing/data/StrokeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStrokesByDrawing", "drawingId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStrokesByDrawing", "getSetting", "key", "setSetting", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSettings", "Lcom/ardrawing/ardrawing/data/SettingEntity;", "initializeDefaultLessons", "app_debug"})
public abstract interface DrawingRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.DrawingEntity>> getAllDrawings();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLessons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.data.LessonEntity> lessons, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLesson(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.LessonEntity lesson, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getAllLessons();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getLessonsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLessonById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ardrawing.ardrawing.data.LessonEntity> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getUnlockedLessons();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLessonProgress(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.LessonProgressEntity progress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLessonProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String lessonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ardrawing.ardrawing.data.LessonProgressEntity> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonProgressEntity>> getAllLessonProgress();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertStrokes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.data.StrokeEntity> strokes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertStroke(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.StrokeEntity stroke, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStrokesByDrawing(long drawingId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ardrawing.ardrawing.data.StrokeEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteStrokesByDrawing(long drawingId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.SettingEntity>> getAllSettings();
    
    public abstract void initializeDefaultLessons();
}