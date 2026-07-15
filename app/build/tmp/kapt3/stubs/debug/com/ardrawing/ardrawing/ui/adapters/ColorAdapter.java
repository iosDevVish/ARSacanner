package com.ardrawing.ardrawing.ui.adapters;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u001c\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/ardrawing/ardrawing/ui/adapters/ColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ardrawing/ardrawing/ui/adapters/ColorAdapter$ColorViewHolder;", "colors", "", "Lcom/ardrawing/ardrawing/drawing/ColorSwatch;", "selectedIndex", "", "onColorClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "updateSelection", "newIndex", "ColorViewHolder", "app_debug"})
public final class ColorAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ardrawing.ardrawing.ui.adapters.ColorAdapter.ColorViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ardrawing.ardrawing.drawing.ColorSwatch> colors = null;
    private final int selectedIndex = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onColorClick = null;
    
    public ColorAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ardrawing.ardrawing.drawing.ColorSwatch> colors, int selectedIndex, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onColorClick) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ardrawing.ardrawing.ui.adapters.ColorAdapter.ColorViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ardrawing.ardrawing.ui.adapters.ColorAdapter.ColorViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateSelection(int newIndex) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ardrawing/ardrawing/ui/adapters/ColorAdapter$ColorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ardrawing/ardrawing/databinding/ItemColorSwatchBinding;", "<init>", "(Lcom/ardrawing/ardrawing/ui/adapters/ColorAdapter;Lcom/ardrawing/ardrawing/databinding/ItemColorSwatchBinding;)V", "bind", "", "color", "Lcom/ardrawing/ardrawing/drawing/ColorSwatch;", "position", "", "app_debug"})
    public final class ColorViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.ardrawing.ardrawing.databinding.ItemColorSwatchBinding binding = null;
        
        public ColorViewHolder(@org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.databinding.ItemColorSwatchBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ardrawing.ardrawing.drawing.ColorSwatch color, int position) {
        }
    }
}