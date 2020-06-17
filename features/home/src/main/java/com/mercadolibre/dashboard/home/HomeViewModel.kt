package com.mercadolibre.dashboard.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mercadolibre.dashboard.common.base.BaseViewModel
import com.mercadolibre.dashboard.common.utils.Event
import com.mercadolibre.dashboard.features.home.R
import com.mercadolibre.dashboard.features.home.domain.GetReleasesUseCase
import com.mercadolibre.dashboard.model.Release
import com.mercadolibre.dashboard.repository.utils.AppDispatchers
import com.mercadolibre.dashboard.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel(private val getReleasesUseCase: GetReleasesUseCase,
                    private val dispatchers: AppDispatchers) : BaseViewModel() {

    // FOR DATA
    private val _releases = MediatorLiveData<Resource<List<Release>>>()
    val releases: LiveData<Resource<List<Release>>> get() = _releases
    private var releaseSource: LiveData<Resource<List<Release>>> = MutableLiveData()

    init {
        getReleases(false)
    }

    // Public Functions
    fun releasesClicksOnItem(release: Release) = navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(release.releaseManager.name))
    fun releasesRefreshesItems() = getReleases(true)


    private fun getReleases(forceRefresh: Boolean) = viewModelScope.launch(dispatchers.main) {
        _releases.removeSource(releaseSource)
        withContext(dispatchers.io) {
            releaseSource = getReleasesUseCase(forceRefresh = forceRefresh)
        }
        _releases.addSource(releaseSource) {
            _releases.value = it
            if (it.error == Exception()) _snackbarError.value = Event(R.string.an_error_happened)
        }
    }
}