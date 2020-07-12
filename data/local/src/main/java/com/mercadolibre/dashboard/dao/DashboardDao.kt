package com.mercadolibre.dashboard.dao

import android.provider.SyncStateContract.Helpers.insert
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mercadolibre.dashboard.model.Metric
import com.mercadolibre.dashboard.model.Release

@Dao
abstract class DashboardDao: BaseDao<Release>() {
    @Query("SELECT * FROM 'release' ORDER BY _id DESC")
    abstract suspend fun getAll(): List<Release>

    @Query("SELECT * FROM 'release' WHERE _id = :id LIMIT 1")
    abstract suspend fun getReleaseDetail(id: Int): Release

    @Query("SELECT * FROM 'metric' WHERE _id = :id LIMIT 1")
    abstract suspend fun getReleaseMetrics(id: Int): Metric

    suspend fun saveReleases(release: Release) {
        insert(release)
    }

    suspend fun saveReleases(releases: List<Release>) {
        insert(releases)
    }

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun saveMetric(metric: Metric)
}