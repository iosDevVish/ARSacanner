package com.ardrawing.ardrawing.util;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007J\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0007J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tH\u0007J\u001a\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0007J\u001a\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\tH\u0007J\u001a\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/ardrawing/ardrawing/util/Converters;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "fromPointList", "", "list", "", "Lcom/ardrawing/ardrawing/util/Point3D;", "toPointList", "json", "fromColorList", "", "toColorList", "fromFloatList", "", "toFloatList", "fromStringList", "toStringList", "fromStrokeData", "stroke", "Lcom/ardrawing/ardrawing/util/StrokeData;", "toStrokeData", "fromStrokeDataList", "toStrokeDataList", "app_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromPointList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ardrawing.ardrawing.util.Point3D> list) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ardrawing.ardrawing.util.Point3D> toPointList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromColorList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> list) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> toColorList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromFloatList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Float> list) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Float> toFloatList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromStringList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> toStringList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromStrokeData(@org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.util.StrokeData stroke) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.util.StrokeData toStrokeData(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromStrokeDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ardrawing.ardrawing.util.StrokeData> list) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ardrawing.ardrawing.util.StrokeData> toStrokeDataList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
}