package com.mercadolibre.dashboard.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.mercadolibre.dashboard.converter.Converter.class})
@androidx.room.Database(entities = {com.mercadolibre.dashboard.model.Release.class, com.mercadolibre.dashboard.model.Metric.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/mercadolibre/dashboard/database/DashboardDatabase;", "Landroidx/room/RoomDatabase;", "()V", "releaseDao", "Lcom/mercadolibre/dashboard/dao/DashboardDao;", "Companion", "local_debug"})
public abstract class DashboardDatabase extends androidx.room.RoomDatabase {
    private static volatile com.mercadolibre.dashboard.database.DashboardDatabase INSTANCE;
    private static final java.lang.String DATABASE_NAME = "releases_database";
    public static final com.mercadolibre.dashboard.database.DashboardDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mercadolibre.dashboard.dao.DashboardDao releaseDao();
    
    public DashboardDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/mercadolibre/dashboard/database/DashboardDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/mercadolibre/dashboard/database/DashboardDatabase;", "getDatabase", "context", "Landroid/content/Context;", "local_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.mercadolibre.dashboard.database.DashboardDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}