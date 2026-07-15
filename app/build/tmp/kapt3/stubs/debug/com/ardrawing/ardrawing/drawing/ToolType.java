package com.ardrawing.ardrawing.drawing;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00162\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType;", "", "id", "", "name", "", "iconRes", "cursorRes", "<init>", "(ILjava/lang/String;II)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getIconRes", "getCursorRes", "BRUSH", "ERASER", "SHAPE", "TEXT", "EYEDROPPER", "FILL", "Companion", "Lcom/ardrawing/ardrawing/drawing/ToolType$BRUSH;", "Lcom/ardrawing/ardrawing/drawing/ToolType$ERASER;", "Lcom/ardrawing/ardrawing/drawing/ToolType$EYEDROPPER;", "Lcom/ardrawing/ardrawing/drawing/ToolType$FILL;", "Lcom/ardrawing/ardrawing/drawing/ToolType$SHAPE;", "Lcom/ardrawing/ardrawing/drawing/ToolType$TEXT;", "app_debug"})
public abstract class ToolType {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int iconRes = 0;
    private final int cursorRes = 0;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.ardrawing.ardrawing.drawing.ToolType> entries = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ardrawing.ardrawing.drawing.ToolType.Companion Companion = null;
    
    private ToolType(int id, java.lang.String name, int iconRes, int cursorRes) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getIconRes() {
        return 0;
    }
    
    public final int getCursorRes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType$BRUSH;", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "<init>", "()V", "app_debug"})
    public static final class BRUSH extends com.ardrawing.ardrawing.drawing.ToolType {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.ToolType.BRUSH INSTANCE = null;
        
        private BRUSH() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType$Companion;", "", "<init>", "()V", "entries", "", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "getEntries", "()Ljava/util/List;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ardrawing.ardrawing.drawing.ToolType> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType$ERASER;", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "<init>", "()V", "app_debug"})
    public static final class ERASER extends com.ardrawing.ardrawing.drawing.ToolType {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.ToolType.ERASER INSTANCE = null;
        
        private ERASER() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType$EYEDROPPER;", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "<init>", "()V", "app_debug"})
    public static final class EYEDROPPER extends com.ardrawing.ardrawing.drawing.ToolType {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.ToolType.EYEDROPPER INSTANCE = null;
        
        private EYEDROPPER() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType$FILL;", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "<init>", "()V", "app_debug"})
    public static final class FILL extends com.ardrawing.ardrawing.drawing.ToolType {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.ToolType.FILL INSTANCE = null;
        
        private FILL() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType$SHAPE;", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "<init>", "()V", "app_debug"})
    public static final class SHAPE extends com.ardrawing.ardrawing.drawing.ToolType {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.ToolType.SHAPE INSTANCE = null;
        
        private SHAPE() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/ToolType$TEXT;", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "<init>", "()V", "app_debug"})
    public static final class TEXT extends com.ardrawing.ardrawing.drawing.ToolType {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.ToolType.TEXT INSTANCE = null;
        
        private TEXT() {
        }
    }
}