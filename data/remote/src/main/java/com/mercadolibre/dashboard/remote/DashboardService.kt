package com.mercadolibre.dashboard.remote

import com.mercadolibre.dashboard.model.Release
import retrofit2.http.GET

interface DashboardService {
    @GET("api/releases")
    suspend fun getReleases(): List<Release>
}