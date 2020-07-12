package com.mercadolibre.dashboard.remote

import com.mercadolibre.dashboard.model.Metric
import com.mercadolibre.dashboard.model.Release
import retrofit2.http.GET
import retrofit2.http.Path

interface DashboardService {
    @GET("api/releases")
    suspend fun getReleases(): List<Release>

    @GET("api/metrics/sessions/release/{releaseId}")
    suspend fun getReleaseMetrics(@Path("releaseId") releaseId: Int): Metric

    @GET("api/metrics/sessions/release/{releaseId}")
    suspend fun getReleaseMetrics2(@Path("releaseId") releaseId: Int): List<Metric>
}