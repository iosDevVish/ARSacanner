package com.ardrawing.ardrawing.ui.dialogs;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ardrawing/ardrawing/ui/dialogs/GuideAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ardrawing/ardrawing/ui/dialogs/GuideAdapter$GuideViewHolder;", "guides", "", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "selectedGuide", "onClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/util/List;Lcom/ardrawing/ardrawing/drawing/DrawingGuide;Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "GuideViewHolder", "app_debug"})
public final class GuideAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ardrawing.ardrawing.ui.dialogs.GuideAdapter.GuideViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ardrawing.ardrawing.drawing.DrawingGuide> guides = null;
    @org.jetbrains.annotations.Nullable()
    private com.ardrawing.ardrawing.drawing.DrawingGuide selectedGuide;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.ardrawing.ardrawing.drawing.DrawingGuide, kotlin.Unit> onClick = null;
    
    public GuideAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.ardrawing.ardrawing.drawing.DrawingGuide> guides, @org.jetbrains.annotations.Nullable()
    com.ardrawing.ardrawing.drawing.DrawingGuide selectedGuide, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ardrawing.ardrawing.drawing.DrawingGuide, kotlin.Unit> onClick) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ardrawing.ardrawing.ui.dialogs.GuideAdapter.GuideViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.ui.dialogs.GuideAdapter.GuideViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/ardrawing/ardrawing/ui/dialogs/GuideAdapter$GuideViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Lcom/ardrawing/ardrawing/ui/dialogs/GuideAdapter;Landroid/view/View;)V", "bind", "", "guide", "Lcom/ardrawing/ardrawing/drawing/DrawingGuide;", "app_debug"})
    public final class GuideViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public GuideViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.drawing.DrawingGuide guide) {
        }
    }
}