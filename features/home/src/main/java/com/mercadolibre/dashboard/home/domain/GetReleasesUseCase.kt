package com.mercadolibre.dashboard.features.home.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.mercadolibre.dashboard.model.Release
import com.mercadolibre.dashboard.repository.DashboardRepository
import com.mercadolibre.dashboard.repository.utils.Resource

class GetReleasesUseCase(private val repository: DashboardRepository) {
    suspend operator fun invoke(forceRefresh: Boolean = false): LiveData<Resource<List<Release>>> {
        return Transformations.map(repository.getReleases(forceRefresh)) {
            it // Place here your specific logic actions
        }
    }
}