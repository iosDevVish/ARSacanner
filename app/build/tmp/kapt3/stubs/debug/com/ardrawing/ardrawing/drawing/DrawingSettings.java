package com.ardrawing.ardrawing.drawing;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\bH\u00c6\u0003J\t\u0010Q\u001a\u00020\nH\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u000fH\u00c6\u0003J\t\u0010U\u001a\u00020\u000fH\u00c6\u0003J\t\u0010V\u001a\u00020\u000fH\u00c6\u0003J\t\u0010W\u001a\u00020\u000fH\u00c6\u0003J\t\u0010X\u001a\u00020\u000fH\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u000fH\u00c6\u0003J\t\u0010[\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\\\u001a\u00020\u0018H\u00c6\u0003J\t\u0010]\u001a\u00020\u000fH\u00c6\u0003J\u00bf\u0001\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010_\u001a\u00020\u000f2\b\u0010`\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010a\u001a\u00020\bH\u00d6\u0001J\t\u0010b\u001a\u00020cH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u00105\"\u0004\bE\u00107R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00105\"\u0004\bK\u00107\u00a8\u0006d"}, d2 = {"Lcom/ardrawing/ardrawing/drawing/DrawingSettings;", "", "brushSize", "", "brushOpacity", "brushHardness", "brushSmoothing", "currentColor", "", "currentTool", "Lcom/ardrawing/ardrawing/drawing/ToolType;", "activeGuide", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "guideOpacity", "showBrushPreview", "", "autoSave", "hapticFeedback", "showFPS", "planeDetectionEnabled", "drawingPlaneHeight", "autoRotateCanvas", "showLessonHints", "drawingMode", "Lcom/ardrawing/ardrawing/drawing/DrawingMode;", "arLightingEstimation", "<init>", "(FFFFILcom/ardrawing/ardrawing/drawing/ToolType;Lcom/ardrawing/ardrawing/drawing/DrawingGuide;FZZZZZFZZLcom/ardrawing/ardrawing/drawing/DrawingMode;Z)V", "getBrushSize", "()F", "setBrushSize", "(F)V", "getBrushOpacity", "setBrushOpacity", "getBrushHardness", "setBrushHardness", "getBrushSmoothing", "setBrushSmoothing", "getCurrentColor", "()I", "setCurrentColor", "(I)V", "getCurrentTool", "()Lcom/ardrawing/ardrawing/drawing/ToolType;", "setCurrentTool", "(Lcom/ardrawing/ardrawing/drawing/ToolType;)V", "getActiveGuide", "()Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "setActiveGuide", "(Lcom/ardrawing/ardrawing/drawing/DrawingGuide;)V", "getGuideOpacity", "setGuideOpacity", "getShowBrushPreview", "()Z", "setShowBrushPreview", "(Z)V", "getAutoSave", "setAutoSave", "getHapticFeedback", "setHapticFeedback", "getShowFPS", "setShowFPS", "getPlaneDetectionEnabled", "setPlaneDetectionEnabled", "getDrawingPlaneHeight", "setDrawingPlaneHeight", "getAutoRotateCanvas", "setAutoRotateCanvas", "getShowLessonHints", "setShowLessonHints", "getDrawingMode", "()Lcom/ardrawing/ardrawing/drawing/DrawingMode;", "setDrawingMode", "(Lcom/ardrawing/ardrawing/drawing/DrawingMode;)V", "getArLightingEstimation", "setArLightingEstimation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class DrawingSettings {
    private float brushSize;
    private float brushOpacity;
    private float brushHardness;
    private float brushSmoothing;
    private int currentColor;
    @org.jetbrains.annotations.NotNull()
    private com.ardrawing.ardrawing.drawing.ToolType currentTool;
    @org.jetbrains.annotations.Nullable()
    private com.ardrawing.ardrawing.drawing.DrawingGuide activeGuide;
    private float guideOpacity;
    private boolean showBrushPreview;
    private boolean autoSave;
    private boolean hapticFeedback;
    private boolean showFPS;
    private boolean planeDetectionEnabled;
    private float drawingPlaneHeight;
    private boolean autoRotateCanvas;
    private boolean showLessonHints;
    @org.jetbrains.annotations.NotNull()
    private com.ardrawing.ardrawing.drawing.DrawingMode drawingMode;
    private boolean arLightingEstimation;
    
    public DrawingSettings(float brushSize, float brushOpacity, float brushHardness, float brushSmoothing, int currentColor, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.ToolType currentTool, @org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingGuide activeGuide, float guideOpacity, boolean showBrushPreview, boolean autoSave, boolean hapticFeedback, boolean showFPS, boolean planeDetectionEnabled, float drawingPlaneHeight, boolean autoRotateCanvas, boolean showLessonHints, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.DrawingMode drawingMode, boolean arLightingEstimation) {
        super();
    }
    
    public final float getBrushSize() {
        return 0.0F;
    }
    
    public final void setBrushSize(float p0) {
    }
    
    public final float getBrushOpacity() {
        return 0.0F;
    }
    
    public final void setBrushOpacity(float p0) {
    }
    
    public final float getBrushHardness() {
        return 0.0F;
    }
    
    public final void setBrushHardness(float p0) {
    }
    
    public final float getBrushSmoothing() {
        return 0.0F;
    }
    
    public final void setBrushSmoothing(float p0) {
    }
    
    public final int getCurrentColor() {
        return 0;
    }
    
    public final void setCurrentColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.ToolType getCurrentTool() {
        return null;
    }
    
    public final void setCurrentTool(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.ToolType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.drawing.DrawingGuide getActiveGuide() {
        return null;
    }
    
    public final void setActiveGuide(@org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingGuide p0) {
    }
    
    public final float getGuideOpacity() {
        return 0.0F;
    }
    
    public final void setGuideOpacity(float p0) {
    }
    
    public final boolean getShowBrushPreview() {
        return false;
    }
    
    public final void setShowBrushPreview(boolean p0) {
    }
    
    public final boolean getAutoSave() {
        return false;
    }
    
    public final void setAutoSave(boolean p0) {
    }
    
    public final boolean getHapticFeedback() {
        return false;
    }
    
    public final void setHapticFeedback(boolean p0) {
    }
    
    public final boolean getShowFPS() {
        return false;
    }
    
    public final void setShowFPS(boolean p0) {
    }
    
    public final boolean getPlaneDetectionEnabled() {
        return false;
    }
    
    public final void setPlaneDetectionEnabled(boolean p0) {
    }
    
    public final float getDrawingPlaneHeight() {
        return 0.0F;
    }
    
    public final void setDrawingPlaneHeight(float p0) {
    }
    
    public final boolean getAutoRotateCanvas() {
        return false;
    }
    
    public final void setAutoRotateCanvas(boolean p0) {
    }
    
    public final boolean getShowLessonHints() {
        return false;
    }
    
    public final void setShowLessonHints(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingMode getDrawingMode() {
        return null;
    }
    
    public final void setDrawingMode(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.DrawingMode p0) {
    }
    
    public final boolean getArLightingEstimation() {
        return false;
    }
    
    public final void setArLightingEstimation(boolean p0) {
    }
    
    public DrawingSettings() {
        super();
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final float component14() {
        return 0.0F;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingMode component17() {
        return null;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.ToolType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ardrawing.ardrawing.drawing.DrawingGuide component7() {
        return null;
    }
    
    public final float component8() {
        return 0.0F;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ardrawing.ardrawing.drawing.DrawingSettings copy(float brushSize, float brushOpacity, float brushHardness, float brushSmoothing, int currentColor, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.ToolType currentTool, @org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingGuide activeGuide, float guideOpacity, boolean showBrushPreview, boolean autoSave, boolean hapticFeedback, boolean showFPS, boolean planeDetectionEnabled, float drawingPlaneHeight, boolean autoRotateCanvas, boolean showLessonHints, @org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.drawing.DrawingMode drawingMode, boolean arLightingEstimation) {
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