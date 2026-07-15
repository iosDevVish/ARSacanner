package com.ardrawing.ardrawing.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190 0\u001fH\u0016J\u001c\u0010!\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020#H\u0096@\u00a2\u0006\u0002\u0010\'J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0\u001fH\u0016J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0\u001f2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u0004\u0018\u00010#2\u0006\u0010-\u001a\u00020+H\u0096@\u00a2\u0006\u0002\u0010.J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0\u001fH\u0016J\u0016\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u000202H\u0096@\u00a2\u0006\u0002\u00103J\u0018\u00104\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u00020+H\u0096@\u00a2\u0006\u0002\u0010.J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020 0\u001fH\u0016J\u001c\u00107\u001a\u00020\u001c2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090 H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u000209H\u0096@\u00a2\u0006\u0002\u0010<J\u001c\u0010=\u001a\b\u0012\u0004\u0012\u0002090 2\u0006\u0010>\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010?J\u0016\u0010@\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010?J\u0018\u0010A\u001a\u0004\u0018\u00010+2\u0006\u0010B\u001a\u00020+H\u0096@\u00a2\u0006\u0002\u0010.J\u001e\u0010C\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020+2\u0006\u0010D\u001a\u00020+H\u0096@\u00a2\u0006\u0002\u0010EJ\u0014\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0 0\u001fH\u0016J\b\u0010H\u001a\u00020\u001cH\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020#0 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lcom/ardrawing/ardrawing/repository/DrawingRepositoryImpl;", "Lcom/ardrawing/ardrawing/repository/DrawingRepository;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "appDatabase", "Lcom/ardrawing/ardrawing/data/AppDatabase;", "drawingDao", "Lcom/ardrawing/ardrawing/data/DrawingDao;", "lessonDao", "Lcom/ardrawing/ardrawing/data/LessonDao;", "lessonProgressDao", "Lcom/ardrawing/ardrawing/data/LessonProgressDao;", "settingDao", "Lcom/ardrawing/ardrawing/data/SettingDao;", "strokeDao", "Lcom/ardrawing/ardrawing/data/StrokeDao;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "gson", "Lcom/google/gson/Gson;", "insertDrawing", "", "drawing", "Lcom/ardrawing/ardrawing/data/DrawingEntity;", "(Lcom/ardrawing/ardrawing/data/DrawingEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDrawing", "", "deleteDrawing", "getAllDrawings", "Landroidx/lifecycle/LiveData;", "", "insertLessons", "lessons", "Lcom/ardrawing/ardrawing/data/LessonEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLesson", "lesson", "(Lcom/ardrawing/ardrawing/data/LessonEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLessons", "getLessonsByCategory", "category", "", "getLessonById", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnlockedLessons", "updateLessonProgress", "progress", "Lcom/ardrawing/ardrawing/data/LessonProgressEntity;", "(Lcom/ardrawing/ardrawing/data/LessonProgressEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLessonProgress", "lessonId", "getAllLessonProgress", "insertStrokes", "strokes", "Lcom/ardrawing/ardrawing/data/StrokeEntity;", "insertStroke", "stroke", "(Lcom/ardrawing/ardrawing/data/StrokeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStrokesByDrawing", "drawingId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStrokesByDrawing", "getSetting", "key", "setSetting", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSettings", "Lcom/ardrawing/ardrawing/data/SettingEntity;", "initializeDefaultLessons", "createDefaultLessons", "app_debug"})
public final class DrawingRepositoryImpl implements com.ardrawing.ardrawing.repository.DrawingRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.data.AppDatabase appDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.data.DrawingDao drawingDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.data.LessonDao lessonDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.data.LessonProgressDao lessonProgressDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.data.SettingDao settingDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.data.StrokeDao strokeDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    public DrawingRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.DrawingEntity>> getAllDrawings() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertLessons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.data.LessonEntity> lessons, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateLesson(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.LessonEntity lesson, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getAllLessons() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getLessonsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLessonById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ardrawing.ardrawing.data.LessonEntity> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getUnlockedLessons() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateLessonProgress(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.LessonProgressEntity progress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLessonProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String lessonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ardrawing.ardrawing.data.LessonProgressEntity> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonProgressEntity>> getAllLessonProgress() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertStrokes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.data.StrokeEntity> strokes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertStroke(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.StrokeEntity stroke, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getStrokesByDrawing(long drawingId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ardrawing.ardrawing.data.StrokeEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteStrokesByDrawing(long drawingId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.SettingEntity>> getAllSettings() {
        return null;
    }
    
    @java.lang.Override()
    public void initializeDefaultLessons() {
    }
    
    private final java.util.List<com.ardrawing.ardrawing.data.LessonEntity> createDefaultLessons() {
        return null;
    }
}