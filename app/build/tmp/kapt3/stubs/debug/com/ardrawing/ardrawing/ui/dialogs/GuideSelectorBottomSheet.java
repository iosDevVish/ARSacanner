package com.ardrawing.ardrawing.ui.dialogs;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ\u001c\u0010\u001b\u001a\u00020\r2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u001d\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/ardrawing/ardrawing/ui/dialogs/GuideSelectorBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "_binding", "Lcom/ardrawing/ardrawing/databinding/LayoutGuideSelectorBinding;", "binding", "getBinding", "()Lcom/ardrawing/ardrawing/databinding/LayoutGuideSelectorBinding;", "selectedGuide", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "onGuideSelected", "Lkotlin/Function1;", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "notifyGuideChange", "setCurrentGuide", "guide", "setOnGuideSelected", "listener", "onDestroyView", "app_debug"})
public final class GuideSelectorBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private com.ardrawing.ardrawing.databinding.LayoutGuideSelectorBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private com.ardrawing.ardrawing.drawing.DrawingGuide selectedGuide;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.ardrawing.ardrawing.drawing.DrawingGuide, kotlin.Unit> onGuideSelected;
    
    public GuideSelectorBottomSheet() {
        super();
    }
    
    private final com.ardrawing.ardrawing.databinding.LayoutGuideSelectorBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void notifyGuideChange() {
    }
    
    public final void setCurrentGuide(@org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingGuide guide) {
    }
    
    public final void setOnGuideSelected(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ardrawing.ardrawing.drawing.DrawingGuide, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}