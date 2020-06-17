package com.mercadolibre.dashboard.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u0011R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/mercadolibre/dashboard/home/HomeViewModel;", "Lcom/mercadolibre/dashboard/common/base/BaseViewModel;", "getReleasesUseCase", "Lcom/mercadolibre/dashboard/features/home/domain/GetReleasesUseCase;", "dispatchers", "Lcom/mercadolibre/dashboard/repository/utils/AppDispatchers;", "(Lcom/mercadolibre/dashboard/features/home/domain/GetReleasesUseCase;Lcom/mercadolibre/dashboard/repository/utils/AppDispatchers;)V", "_releases", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/mercadolibre/dashboard/repository/utils/Resource;", "", "Lcom/mercadolibre/dashboard/model/Release;", "releaseSource", "Landroidx/lifecycle/LiveData;", "releases", "getReleases", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/Job;", "forceRefresh", "", "releasesClicksOnItem", "", "release", "releasesRefreshesItems", "home_debug"})
public final class HomeViewModel extends com.mercadolibre.dashboard.common.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>>> _releases = null;
    private androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>>> releaseSource;
    private final com.mercadolibre.dashboard.features.home.domain.GetReleasesUseCase getReleasesUseCase = null;
    private final com.mercadolibre.dashboard.repository.utils.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>>> getReleases() {
        return null;
    }
    
    public final void releasesClicksOnItem(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.model.Release release) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job releasesRefreshesItems() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getReleases(boolean forceRefresh) {
        return null;
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.features.home.domain.GetReleasesUseCase getReleasesUseCase, @org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.repository.utils.AppDispatchers dispatchers) {
        super();
    }
}