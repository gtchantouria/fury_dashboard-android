package com.mercadolibre.dashboard.repository

import androidx.lifecycle.LiveData
import com.mercadolibre.dashboard.model.Metric
import com.mercadolibre.dashboard.model.Release
import com.mercadolibre.dashboard.repository.utils.Resource

interface DashboardRepository {
    suspend fun getReleases(forceRefresh: Boolean = false, appName: String? = null): LiveData<Resource<List<Release>>>
    suspend fun getReleaseMetrics(forceRefresh: Boolean = false, releaseId: Int): LiveData<Resource<Metric>>
}