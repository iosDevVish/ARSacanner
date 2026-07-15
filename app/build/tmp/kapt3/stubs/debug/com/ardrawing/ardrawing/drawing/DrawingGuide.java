package com.ardrawing.ardrawing.drawing;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001a2\u00020\u0001:\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\n\u001b\u001c\u001d\u001e\u001f !\"#$\u00a8\u0006%"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "", "id", "", "name", "description", "iconRes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getIconRes", "()I", "GRID", "PERSPECTIVE", "CIRCLE", "LINE", "SYMMETRY", "PERSPECTIVE_GRID", "ISOMETRIC", "GOLDEN_RATIO", "RULE_OF_THIRDS", "SPIRAL", "Companion", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$CIRCLE;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$GOLDEN_RATIO;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$GRID;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$ISOMETRIC;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$LINE;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$PERSPECTIVE;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$PERSPECTIVE_GRID;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$RULE_OF_THIRDS;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$SPIRAL;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide$SYMMETRY;", "app_debug"})
public abstract class DrawingGuide {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final int iconRes = 0;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.ardrawing.ardrawing.drawing.DrawingGuide> ALL = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ardrawing.ardrawing.drawing.DrawingGuide.Companion Companion = null;
    
    private DrawingGuide(java.lang.String id, java.lang.String name, java.lang.String description, int iconRes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int getIconRes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$CIRCLE;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class CIRCLE extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.CIRCLE INSTANCE = null;
        
        private CIRCLE() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$Companion;", "", "<init>", "()V", "ALL", "", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "getALL", "()Ljava/util/List;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ardrawing.ardrawing.drawing.DrawingGuide> getALL() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$GOLDEN_RATIO;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class GOLDEN_RATIO extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.GOLDEN_RATIO INSTANCE = null;
        
        private GOLDEN_RATIO() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$GRID;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class GRID extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.GRID INSTANCE = null;
        
        private GRID() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$ISOMETRIC;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class ISOMETRIC extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.ISOMETRIC INSTANCE = null;
        
        private ISOMETRIC() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$LINE;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class LINE extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.LINE INSTANCE = null;
        
        private LINE() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$PERSPECTIVE;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class PERSPECTIVE extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.PERSPECTIVE INSTANCE = null;
        
        private PERSPECTIVE() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$PERSPECTIVE_GRID;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class PERSPECTIVE_GRID extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.PERSPECTIVE_GRID INSTANCE = null;
        
        private PERSPECTIVE_GRID() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$RULE_OF_THIRDS;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class RULE_OF_THIRDS extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.RULE_OF_THIRDS INSTANCE = null;
        
        private RULE_OF_THIRDS() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$SPIRAL;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class SPIRAL extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.SPIRAL INSTANCE = null;
        
        private SPIRAL() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingGuide$SYMMETRY;", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "<init>", "()V", "app_debug"})
    public static final class SYMMETRY extends com.ardrawing.ardrawing.drawing.DrawingGuide {
        @org.jetbrains.annotations.NotNull()
        public static final com.ardrawing.ardrawing.drawing.DrawingGuide.SYMMETRY INSTANCE = null;
        
        private SYMMETRY() {
        }
    }
}