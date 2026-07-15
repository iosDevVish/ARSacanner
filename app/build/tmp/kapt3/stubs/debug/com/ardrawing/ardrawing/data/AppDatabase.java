package com.ardrawing.ardrawing.data;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000f"}, d2 = {"Lcom/ardrawing/ardrawing/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "drawingDao", "Lcom/ardrawing/ardrawing/data/DrawingDao;", "lessonDao", "Lcom/ardrawing/ardrawing/data/LessonDao;", "lessonProgressDao", "Lcom/ardrawing/ardrawing/data/LessonProgressDao;", "settingDao", "Lcom/ardrawing/ardrawing/data/SettingDao;", "strokeDao", "Lcom/ardrawing/ardrawing/data/StrokeDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.ardrawing.ardrawing.data.DrawingEntity.class, com.ardrawing.ardrawing.data.LessonEntity.class, com.ardrawing.ardrawing.data.LessonProgressEntity.class, com.ardrawing.ardrawing.data.SettingEntity.class, com.ardrawing.ardrawing.data.StrokeEntity.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.ardrawing.ardrawing.util.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.ardrawing.ardrawing.data.AppDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.ardrawing.ardrawing.data.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ardrawing.ardrawing.data.DrawingDao drawingDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ardrawing.ardrawing.data.LessonDao lessonDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ardrawing.ardrawing.data.LessonProgressDao lessonProgressDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ardrawing.ardrawing.data.SettingDao settingDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ardrawing.ardrawing.data.StrokeDao strokeDao();
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ardrawing/ardrawing/data/AppDatabase$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/ardrawing/ardrawing/data/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ardrawing.ardrawing.data.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}