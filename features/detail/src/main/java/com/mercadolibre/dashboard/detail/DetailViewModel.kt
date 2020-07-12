package com.mercadolibre.dashboard.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mercadolibre.dashboard.common.base.BaseViewModel
import com.mercadolibre.dashboard.common.utils.Event
import com.mercadolibre.dashboard.detail.domain.GetReleaseMetricsUseCase
import com.mercadolibre.dashboard.features.detail.R
import com.mercadolibre.dashboard.model.Metric
import com.mercadolibre.dashboard.repository.utils.AppDispatchers
import com.mercadolibre.dashboard.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailViewModel(
    private val getReleaseMetricsUSeCase: GetReleaseMetricsUseCase,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // PRIVATE DATA
    private var releaseId: Int = 0
    private var metricsSource: LiveData<Resource<Metric>> = MutableLiveData()

    private val _metrics = MediatorLiveData<Metric>()
    val metrics: LiveData<Metric> get() = _metrics

    private val _isLoading = MutableLiveData<Resource.Status>()
    val isLoading: LiveData<Resource.Status> get() = _isLoading

    // PUBLIC ACTIONS ---
    fun loadDataWhenActivityStarts(releaseId: Int) {
        this.releaseId = releaseId
        getMetricsDetail(false)
    }

    fun reloadDataWhenUserRefreshes() = getMetricsDetail(true)

    // ---
    private fun getMetricsDetail(forceRefresh: Boolean) = viewModelScope.launch(dispatchers.main) {
        _metrics.removeSource(metricsSource) // We make sure there is only one source of livedata (allowing us properly refresh)
        withContext(dispatchers.io) {
            metricsSource =
                getReleaseMetricsUSeCase(forceRefresh = forceRefresh, releaseId = releaseId)
        }

        _metrics.addSource(metricsSource) {
            _metrics.value = it.data
            _isLoading.value = it.status
            if (it.status == Resource.Status.ERROR) _snackbarError.value =
                Event(R.string.an_error_happened)
        }
    }
}