package com.mercadolibre.dashboard.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/mercadolibre/dashboard/dao/DashboardDao;", "Lcom/mercadolibre/dashboard/dao/BaseDao;", "Lcom/mercadolibre/dashboard/model/Release;", "()V", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReleaseDetail", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReleaseMetrics", "Lcom/mercadolibre/dashboard/model/Metric;", "saveMetric", "", "metric", "(Lcom/mercadolibre/dashboard/model/Metric;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveReleases", "release", "(Lcom/mercadolibre/dashboard/model/Release;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "releases", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "local_debug"})
public abstract class DashboardDao extends com.mercadolibre.dashboard.dao.BaseDao<com.mercadolibre.dashboard.model.Release> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM \'release\' ORDER BY _id DESC")
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mercadolibre.dashboard.model.Release>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM \'release\' WHERE _id = :id LIMIT 1")
    public abstract java.lang.Object getReleaseDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mercadolibre.dashboard.model.Release> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM \'metric\' WHERE _id = :id LIMIT 1")
    public abstract java.lang.Object getReleaseMetrics(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mercadolibre.dashboard.model.Metric> p1);
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveReleases(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.model.Release release, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveReleases(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mercadolibre.dashboard.model.Release> releases, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveMetric(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dashboard.model.Metric metric, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    public DashboardDao() {
        super();
    }
}