package com.mercadolibre.dashboard.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy

abstract class BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun insert(releases: List<T>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun insert(release: T)
}