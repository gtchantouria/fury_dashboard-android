package com.mercadolibre.dashboard.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/mercadolibre/dashboard/dao/DashboardDao;", "Lcom/mercadolibre/dashboard/dao/BaseDao;", "Lcom/mercadolibre/dashboard/model/Release;", "()V", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveReleases", "", "releases", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "local_debug"})
public abstract class DashboardDao extends com.mercadolibre.dashboard.dao.BaseDao<com.mercadolibre.dashboard.model.Release> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM \'release\' ORDER BY _id DESC")
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mercadolibre.dashboard.model.Release>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveReleases(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mercadolibre.dashboard.model.Release> releases, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public DashboardDao() {
        super();
    }
}