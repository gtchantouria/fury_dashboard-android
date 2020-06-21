package com.mercadolibre.dashboard.home.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J&\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rH\u0007J&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rH\u0007J&\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0005\u001a\u00020\u00142\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u0013\u0018\u00010\rH\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/mercadolibre/dashboard/home/views/HomeBinding;", "", "()V", "loadImage", "", "view", "Landroid/widget/ImageView;", "url", "", "setItems", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "resource", "Lcom/mercadolibre/dashboard/repository/utils/Resource;", "", "Lcom/mercadolibre/dashboard/model/Release;", "showMessageErrorWhenEmptyList", "Landroid/view/View;", "showWhenLoading", "T", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "home_debug"})
public final class HomeBinding {
    public static final com.mercadolibre.dashboard.home.views.HomeBinding INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"app:showWhenLoading"})
    public static final <T extends java.lang.Object>void showWhenLoading(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout view, @org.jetbrains.annotations.Nullable()
    com.mercadolibre.dashboard.repository.utils.Resource<? extends T> resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:items"})
    public static final void setItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    com.mercadolibre.dashboard.repository.utils.Resource<? extends java.util.List<com.mercadolibre.dashboard.model.Release>> resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:showWhenEmptyList"})
    public static final void showMessageErrorWhenEmptyList(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.mercadolibre.dashboard.repository.utils.Resource<? extends java.util.List<com.mercadolibre.dashboard.model.Release>> resource) {
    }
    
    private HomeBinding() {
        super();
    }
}