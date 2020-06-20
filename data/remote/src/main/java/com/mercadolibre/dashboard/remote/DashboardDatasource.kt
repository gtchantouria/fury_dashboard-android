package com.mercadolibre.dashboard.remote

import com.mercadolibre.dashboard.model.Release

/**
 * Implements [DashboardService] interface.
 */
class DashboardDatasource(private val dashboardService: DashboardService) {
    suspend fun getReleases(): List<Release> = dashboardService.getReleases()
}