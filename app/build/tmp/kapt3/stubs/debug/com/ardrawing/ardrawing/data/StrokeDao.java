package com.ardrawing.ardrawing.data;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\r\u00c0\u0006\u0003"}, d2 = {"Lcom/ardrawing/ardrawing/data/StrokeDao;", "", "insertAll", "", "strokes", "", "Lcom/ardrawing/ardrawing/data/StrokeEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStrokesByDrawing", "drawingId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByDrawingId", "app_debug"})
@androidx.room.Dao()
public abstract interface StrokeDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.data.StrokeEntity> strokes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM drawing_strokes WHERE drawingId = :drawingId ORDER BY timestamp")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStrokesByDrawing(long drawingId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ardrawing.ardrawing.data.StrokeEntity>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM drawing_strokes WHERE drawingId = :drawingId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteByDrawingId(long drawingId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}