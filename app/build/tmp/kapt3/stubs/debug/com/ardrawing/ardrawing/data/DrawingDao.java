package com.ardrawing.ardrawing.data;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0014\u00c0\u0006\u0003"}, d2 = {"Lcom/ardrawing/ardrawing/data/DrawingDao;", "", "insert", "", "drawing", "Lcom/ardrawing/ardrawing/data/DrawingEntity;", "(Lcom/ardrawing/ardrawing/data/DrawingEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "delete", "getAllDrawings", "Lkotlinx/coroutines/flow/Flow;", "", "getDrawingsByLesson", "lessonId", "", "getDrawingById", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "app_debug"})
@androidx.room.Dao()
public abstract interface DrawingDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.data.DrawingEntity drawing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM drawings ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ardrawing.ardrawing.data.DrawingEntity>> getAllDrawings();
    
    @androidx.room.Query(value = "SELECT * FROM drawings WHERE lessonId = :lessonId ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ardrawing.ardrawing.data.DrawingEntity>> getDrawingsByLesson(@org.jetbrains.annotations.NotNull()
    java.lang.String lessonId);
    
    @androidx.room.Query(value = "SELECT * FROM drawings WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDrawingById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ardrawing.ardrawing.data.DrawingEntity> $completion);
    
    @androidx.room.Query(value = "DELETE FROM drawings WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}