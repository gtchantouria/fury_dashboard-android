package com.mercadolibre.dashboard.detail.domain;

import java.lang.System;

/**
 * Use case that gets a [Resource] [Release] from [DashboardRepository]
 * and makes some specific logic actions on it.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/mercadolibre/dashboard/detail/domain/GetReleaseMetricsUseCase;", "", "dashboardRepository", "Lcom/mercadolibre/dashboard/repository/DashboardRepository;", "(Lcom/mercadolibre/dashboard/repository/DashboardRepository;)V", "invoke", "Landroidx/lifecycle/LiveData;", "Lcom/mercadolibre/dashboard/repository/utils/Resource;", "Lcom/mercadolibre/dashboard/model/Metric;", "forceRefresh", "", "releaseId", "", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pedo", "", "detail_debug"})
public final class GetReleaseMetricsUseCase {
    private final com.mercadolibre.dashboard.repository.DashboardRepository dashboardRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(boolean forceRefresh, int releaseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<com.mercadolibre.dashboard.model.Metric>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pedo(boolean forceRefresh, int releaseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<java.lang.Float>> p2) {
        return null;
    }
    
    public GetReleaseMetricsUseCase(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.repository.DashboardRepository dashboardRepository) {
        super();
    }
}