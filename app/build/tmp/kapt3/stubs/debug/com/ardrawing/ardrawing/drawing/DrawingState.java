package com.ardrawing.ardrawing.drawing;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u0004J\u0006\u0010)\u001a\u00020\u0000J\u0006\u0010*\u001a\u00020\u0000J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\t\u00100\u001a\u00020\fH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\t\u00103\u001a\u00020\tH\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003Jw\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tH\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0007H\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001c\u00a8\u0006<"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingState;", "", "strokes", "", "Lcom/ardrawing/ardrawing/drawing/DrawingStroke;", "currentStroke", "currentColor", "", "currentBrushSize", "", "currentOpacity", "currentTool", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "selectedGuide", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "canvasPosition", "Lcom/ardrawing/ardrawing/util/Point3D;", "canvasRotation", "canvasScale", "<init>", "(Ljava/util/List;Lcom/ardrawing/ardrawing/drawing/DrawingStroke;IFFLcom/ardrawing/ardrawing/drawing/ToolType;Lcom/ardrawing/ardrawing/drawing/DrawingGuide;Lcom/ardrawing/ardrawing/util/Point3D;FF)V", "getStrokes", "()Ljava/util/List;", "getCurrentStroke", "()Lcom/ardrawing/ardrawing/drawing/DrawingStroke;", "getCurrentColor", "()I", "getCurrentBrushSize", "()F", "getCurrentOpacity", "getCurrentTool", "()Lcom/ardrawing/ardrawing/drawing/ToolType;", "getSelectedGuide", "()Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "getCanvasPosition", "()Lcom/ardrawing/ardrawing/util/Point3D;", "getCanvasRotation", "getCanvasScale", "withNewStroke", "stroke", "addStroke", "undo", "clear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class DrawingState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ardrawing.ardrawing.drawing.DrawingStroke> strokes = null;
    @org.jetbrains.annotations.Nullable()
    private final com.ardrawing.ardrawing.drawing.DrawingStroke currentStroke = null;
    private final int currentColor = 0;
    private final float currentBrushSize = 0.0F;
    private final float currentOpacity = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.drawing.ToolType currentTool = null;
    @org.jetbrains.annotations.Nullable()
    private final com.ardrawing.ardrawing.drawing.DrawingGuide selectedGuide = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ardrawing.ardrawing.util.Point3D canvasPosition = null;
    private final float canvasRotation = 0.0F;
    private final float canvasScale = 0.0F;
    
    public DrawingState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.drawing.DrawingStroke> strokes, @org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingStroke currentStroke, int currentColor, float currentBrushSize, float currentOpacity, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.ToolType currentTool, @org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingGuide selectedGuide, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.util.Point3D canvasPosition, float canvasRotation, float canvasScale) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ardrawing.ardrawing.drawing.DrawingStroke> getStrokes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.drawing.DrawingStroke getCurrentStroke() {
        return null;
    }
    
    public final int getCurrentColor() {
        return 0;
    }
    
    public final float getCurrentBrushSize() {
        return 0.0F;
    }
    
    public final float getCurrentOpacity() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.ToolType getCurrentTool() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.drawing.DrawingGuide getSelectedGuide() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.util.Point3D getCanvasPosition() {
        return null;
    }
    
    public final float getCanvasRotation() {
        return 0.0F;
    }
    
    public final float getCanvasScale() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingState withNewStroke(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.DrawingStroke stroke) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingState addStroke(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.DrawingStroke stroke) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingState undo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingState clear() {
        return null;
    }
    
    public DrawingState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ardrawing.ardrawing.drawing.DrawingStroke> component1() {
        return null;
    }
    
    public final float component10() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.drawing.DrawingStroke component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.ToolType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.drawing.DrawingGuide component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.util.Point3D component8() {
        return null;
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.drawing.DrawingStroke> strokes, @org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingStroke currentStroke, int currentColor, float currentBrushSize, float currentOpacity, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.ToolType currentTool, @org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingGuide selectedGuide, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.util.Point3D canvasPosition, float canvasRotation, float canvasScale) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}