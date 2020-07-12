package com.mercadolibre.dashboard.detail.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.mercadolibre.dashboard.model.Metric
import com.mercadolibre.dashboard.model.Release
import com.mercadolibre.dashboard.repository.DashboardRepository
import com.mercadolibre.dashboard.repository.utils.Resource

/**
 * Use case that gets a [Resource] [Release] from [DashboardRepository]
 * and makes some specific logic actions on it.
 *
 */
class GetReleaseMetricsUseCase(private val dashboardRepository: DashboardRepository) {
    suspend operator fun invoke(forceRefresh: Boolean = false, releaseId: Int): LiveData<Resource<Metric>> {
        return Transformations.map(dashboardRepository.getReleaseMetrics(forceRefresh, releaseId)) {
            it // Place here your specific logic actions (if any)
        }
    }

    suspend fun pedo(forceRefresh: Boolean = false, releaseId: Int): LiveData<Float> {
        return Transformations.map(dashboardRepository.getReleaseMetrics(forceRefresh, releaseId)) {
            (it.data!!.sessionsCountInLast24H / (it.data!!.releaseSessionsCount / it.data!!.sessionsCount) * 100).toFloat()
        }
    }
}