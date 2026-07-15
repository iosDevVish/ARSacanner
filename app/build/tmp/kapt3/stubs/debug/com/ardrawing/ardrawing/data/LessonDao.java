package com.ardrawing.ardrawing.data;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\fH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\f2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\fH\'\u00a8\u0006\u0014\u00c0\u0006\u0003"}, d2 = {"Lcom/ardrawing/ardrawing/data/LessonDao;", "", "insertAll", "", "lessons", "", "Lcom/ardrawing/ardrawing/data/LessonEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "lesson", "(Lcom/ardrawing/ardrawing/data/LessonEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLessons", "Lkotlinx/coroutines/flow/Flow;", "getLessonsByCategory", "category", "", "getLessonById", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnlockedLessons", "app_debug"})
@androidx.room.Dao()
public abstract interface LessonDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.data.LessonEntity> lessons, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.LessonEntity lesson, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM lessons ORDER BY category, difficulty")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getAllLessons();
    
    @androidx.room.Query(value = "SELECT * FROM lessons WHERE category = :category ORDER BY difficulty")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getLessonsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @androidx.room.Query(value = "SELECT * FROM lessons WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLessonById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ardrawing.ardrawing.data.LessonEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM lessons WHERE isUnlocked = 1 ORDER BY category, difficulty")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ardrawing.ardrawing.data.LessonEntity>> getUnlockedLessons();
}