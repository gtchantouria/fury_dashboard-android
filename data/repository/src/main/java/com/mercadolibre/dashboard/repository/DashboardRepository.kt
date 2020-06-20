package com.mercadolibre.dashboard.repository

import androidx.lifecycle.LiveData
import com.mercadolibre.dashboard.model.Release
import com.mercadolibre.dashboard.repository.utils.Resource

interface DashboardRepository {
    suspend fun getReleases(forceRefresh: Boolean = false): LiveData<Resource<List<Release>>>
}