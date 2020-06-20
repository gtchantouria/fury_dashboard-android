package com.mercadolibre.dashboard.dao

import android.provider.SyncStateContract.Helpers.insert
import androidx.room.Dao
import androidx.room.Query
import com.mercadolibre.dashboard.model.Release

@Dao
abstract class DashboardDao: BaseDao<Release>() {
    @Query("SELECT * FROM 'release' ORDER BY _id DESC")
    abstract suspend fun getAll(): List<Release>

    suspend fun saveReleases(releases: List<Release>) {
        insert(releases)
    }
}