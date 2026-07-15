package com.ardrawing.ardrawing.viewmodel;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bJ\u0014\u0010\"\u001a\u00020\u001d2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010+\u001a\u00020,H\u0086@\u00a2\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200J\u0016\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020,J \u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u00192\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020,H\u0002J\u0018\u00106\u001a\u0004\u0018\u00010,2\u0006\u00102\u001a\u00020,H\u0086@\u00a2\u0006\u0002\u0010-J\u000e\u00107\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u000bJ\u0010\u00108\u001a\u0004\u0018\u00010\u000b2\u0006\u00109\u001a\u00020,R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\r\u00a8\u0006:"}, d2 = {"Lcom/ardrawing/ardrawing/viewmodel/DrawingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "repository", "Lcom/ardrawing/ardrawing/repository/DrawingRepository;", "allDrawings", "Landroidx/lifecycle/LiveData;", "", "Lcom/ardrawing/ardrawing/data/DrawingEntity;", "getAllDrawings", "()Landroidx/lifecycle/LiveData;", "allLessons", "Lcom/ardrawing/ardrawing/data/LessonEntity;", "getAllLessons", "allLessonProgress", "Lcom/ardrawing/ardrawing/data/LessonProgressEntity;", "getAllLessonProgress", "allSettings", "Lcom/ardrawing/ardrawing/data/SettingEntity;", "getAllSettings", "_currentSettings", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ardrawing/ardrawing/drawing/DrawingSettings;", "currentSettings", "getCurrentSettings", "loadSettings", "", "insertDrawing", "drawing", "updateDrawing", "deleteDrawing", "insertLessons", "lessons", "updateLesson", "lesson", "Lcom/ardrawing/ardrawing/drawing/Lesson;", "updateLessonProgress", "progress", "Lcom/ardrawing/ardrawing/drawing/LessonProgress;", "getLessonProgress", "lessonId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStroke", "stroke", "Lcom/ardrawing/ardrawing/util/StrokeData;", "updateSetting", "key", "value", "applySetting", "settings", "getSetting", "exportDrawing", "importDrawing", "json", "app_debug"})
public final class DrawingViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.repository.DrawingRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.DrawingEntity>> allDrawings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> allLessons = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonProgressEntity>> allLessonProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.SettingEntity>> allSettings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ardrawing.ardrawing.drawing.DrawingSettings> _currentSettings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ardrawing.ardrawing.drawing.DrawingSettings> currentSettings = null;
    
    public DrawingViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.DrawingEntity>> getAllDrawings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getAllLessons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.LessonProgressEntity>> getAllLessonProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ardrawing.ardrawing.data.SettingEntity>> getAllSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ardrawing.ardrawing.drawing.DrawingSettings> getCurrentSettings() {
        return null;
    }
    
    private final void loadSettings() {
    }
    
    public final void insertDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing) {
    }
    
    public final void updateDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing) {
    }
    
    public final void deleteDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing) {
    }
    
    public final void insertLessons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.data.LessonEntity> lessons) {
    }
    
    public final void updateLesson(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.Lesson lesson) {
    }
    
    public final void updateLessonProgress(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.LessonProgress progress) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLessonProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String lessonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ardrawing.ardrawing.drawing.LessonProgress> $completion) {
        return null;
    }
    
    public final void insertStroke(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.util.StrokeData stroke) {
    }
    
    public final void updateSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    private final void applySetting(com.ardrawing.ardrawing.drawing.DrawingSettings settings, java.lang.String key, java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String exportDrawing(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.data.DrawingEntity importDrawing(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
}