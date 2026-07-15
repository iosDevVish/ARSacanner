package com.ardrawing.ardrawing.ui.dialogs;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0014\u0010\u0019\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\u001a\u001a\u00020\u000e2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rJ\b\u0010\u001c\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/ardrawing/ardrawing/ui/dialogs/LessonSelectorBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "_binding", "Lcom/ardrawing/ardrawing/databinding/LayoutLessonSelectorBinding;", "binding", "getBinding", "()Lcom/ardrawing/ardrawing/databinding/LayoutLessonSelectorBinding;", "lessons", "", "Lcom/ardrawing/ardrawing/drawing/Lesson;", "onLessonSelected", "Lkotlin/Function1;", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setLessons", "setOnLessonSelected", "listener", "onDestroyView", "app_debug"})
public final class LessonSelectorBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private com.ardrawing.ardrawing.databinding.LayoutLessonSelectorBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.ardrawing.ardrawing.drawing.Lesson> lessons;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.ardrawing.ardrawing.drawing.Lesson, kotlin.Unit> onLessonSelected;
    
    public LessonSelectorBottomSheet() {
        super();
    }
    
    private final com.ardrawing.ardrawing.databinding.LayoutLessonSelectorBinding getBinding() {
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
    
    public final void setLessons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.drawing.Lesson> lessons) {
    }
    
    public final void setOnLessonSelected(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ardrawing.ardrawing.drawing.Lesson, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}