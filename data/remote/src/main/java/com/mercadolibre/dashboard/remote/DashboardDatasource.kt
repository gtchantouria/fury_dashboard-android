package com.mercadolibre.dashboard.remote

import com.mercadolibre.dashboard.model.Metric
import com.mercadolibre.dashboard.model.Release

/**
 * Implements [DashboardService] interface.
 */
class DashboardDatasource(private val dashboardService: DashboardService) {
    suspend fun getReleases(): List<Release> = dashboardService.getReleases()
    suspend fun getReleaseMetrics(releaseId: Int): Metric =
        dashboardService.getReleaseMetrics(releaseId)
    suspend fun getReleaseMetrics2(releaseId: Int): List<Metric> =
        dashboardService.getReleaseMetrics2(releaseId)
}