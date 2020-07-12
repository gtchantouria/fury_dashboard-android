package com.mercadolibre.dashboard.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/mercadolibre/dashboard/detail/DetailViewModel;", "Lcom/mercadolibre/dashboard/common/base/BaseViewModel;", "getReleaseMetricsUSeCase", "Lcom/mercadolibre/dashboard/detail/domain/GetReleaseMetricsUseCase;", "dispatchers", "Lcom/mercadolibre/dashboard/repository/utils/AppDispatchers;", "(Lcom/mercadolibre/dashboard/detail/domain/GetReleaseMetricsUseCase;Lcom/mercadolibre/dashboard/repository/utils/AppDispatchers;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mercadolibre/dashboard/repository/utils/Resource$Status;", "_metrics", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/mercadolibre/dashboard/model/Metric;", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "metrics", "getMetrics", "metricsSource", "Lcom/mercadolibre/dashboard/repository/utils/Resource;", "releaseId", "", "getMetricsDetail", "Lkotlinx/coroutines/Job;", "forceRefresh", "", "loadDataWhenActivityStarts", "", "reloadDataWhenUserRefreshes", "detail_debug"})
public final class DetailViewModel extends com.mercadolibre.dashboard.common.base.BaseViewModel {
    private int releaseId;
    private androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<com.mercadolibre.dashboard.model.Metric>> metricsSource;
    private final androidx.lifecycle.MediatorLiveData<com.mercadolibre.dashboard.model.Metric> _metrics = null;
    private final androidx.lifecycle.MutableLiveData<com.mercadolibre.dashboard.repository.utils.Resource.Status> _isLoading = null;
    private final com.mercadolibre.dashboard.detail.domain.GetReleaseMetricsUseCase getReleaseMetricsUSeCase = null;
    private final com.mercadolibre.dashboard.repository.utils.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.mercadolibre.dashboard.model.Metric> getMetrics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource.Status> isLoading() {
        return null;
    }
    
    public final void loadDataWhenActivityStarts(int releaseId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job reloadDataWhenUserRefreshes() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getMetricsDetail(boolean forceRefresh) {
        return null;
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.detail.domain.GetReleaseMetricsUseCase getReleaseMetricsUSeCase, @org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.repository.utils.AppDispatchers dispatchers) {
        super();
    }
}