package com.mercadolibre.dashboard.features.home.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/mercadolibre/dashboard/features/home/domain/GetReleasesUseCase;", "", "repository", "Lcom/mercadolibre/dashboard/repository/DashboardRepository;", "(Lcom/mercadolibre/dashboard/repository/DashboardRepository;)V", "invoke", "Landroidx/lifecycle/LiveData;", "Lcom/mercadolibre/dashboard/repository/utils/Resource;", "", "Lcom/mercadolibre/dashboard/model/Release;", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "home_debug"})
public final class GetReleasesUseCase {
    private final com.mercadolibre.dashboard.repository.DashboardRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(boolean forceRefresh, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>>>> p1) {
        return null;
    }
    
    public GetReleasesUseCase(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.repository.DashboardRepository repository) {
        super();
    }
}