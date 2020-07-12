package com.mercadolibre.dashboard.detail.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/mercadolibre/dashboard/detail/views/ReleaseMetricsBinding;", "", "()V", "adoption", "", "view", "Landroid/widget/TextView;", "metrics", "Landroidx/lifecycle/LiveData;", "Lcom/mercadolibre/dashboard/model/Metric;", "crashRate", "loadImageRounded", "Landroid/widget/ImageView;", "url", "", "showWhenLoading", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "status", "Lcom/mercadolibre/dashboard/repository/utils/Resource$Status;", "detail_debug"})
public final class ReleaseMetricsBinding {
    public static final com.mercadolibre.dashboard.detail.views.ReleaseMetricsBinding INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"app:showWhenLoading"})
    public static final void showWhenLoading(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout view, @org.jetbrains.annotations.Nullable()
    com.mercadolibre.dashboard.repository.utils.Resource.Status status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:imageUrlRounded"})
    public static final void loadImageRounded(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:crashRate"})
    public static final void crashRate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.mercadolibre.dashboard.model.Metric> metrics) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:adoption"})
    public static final void adoption(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.mercadolibre.dashboard.model.Metric> metrics) {
    }
    
    private ReleaseMetricsBinding() {
        super();
    }
}