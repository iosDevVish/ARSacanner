package com.ardrawing.ardrawing.ui.adapters;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0013\u0014B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ardrawing/ardrawing/ui/adapters/LessonAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ardrawing/ardrawing/drawing/Lesson;", "Lcom/ardrawing/ardrawing/ui/adapters/LessonAdapter$LessonViewHolder;", "lessons", "", "onLessonClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "LessonViewHolder", "LessonDiffCallback", "app_debug"})
public final class LessonAdapter extends androidx.recyclerview.widget.ListAdapter<com.ardrawing.ardrawing.drawing.Lesson, com.ardrawing.ardrawing.ui.adapters.LessonAdapter.LessonViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ardrawing.ardrawing.drawing.Lesson> lessons = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.ardrawing.ardrawing.drawing.Lesson, kotlin.Unit> onLessonClick = null;
    
    public LessonAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.drawing.Lesson> lessons, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ardrawing.ardrawing.drawing.Lesson, kotlin.Unit> onLessonClick) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ardrawing.ardrawing.ui.adapters.LessonAdapter.LessonViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.ui.adapters.LessonAdapter.LessonViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/ardrawing/ardrawing/ui/adapters/LessonAdapter$LessonDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ardrawing/ardrawing/drawing/Lesson;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "app_debug"})
    public static final class LessonDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ardrawing.ardrawing.drawing.Lesson> {
        
        public LessonDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.drawing.Lesson oldItem, @org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.drawing.Lesson newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.drawing.Lesson oldItem, @org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.drawing.Lesson newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/ardrawing/ardrawing/ui/adapters/LessonAdapter$LessonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ardrawing/ardrawing/databinding/ItemLessonBinding;", "<init>", "(Lcom/ardrawing/ardrawing/ui/adapters/LessonAdapter;Lcom/ardrawing/ardrawing/databinding/ItemLessonBinding;)V", "bind", "", "lesson", "Lcom/ardrawing/ardrawing/drawing/Lesson;", "app_debug"})
    public final class LessonViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.ardrawing.ardrawing.databinding.ItemLessonBinding binding = null;
        
        public LessonViewHolder(@org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.databinding.ItemLessonBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.drawing.Lesson lesson) {
        }
    }
}