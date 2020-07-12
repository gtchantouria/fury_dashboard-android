package com.mercadolibre.dashboard.detail.di

import com.mercadolibre.dashboard.detail.domain.GetReleaseMetricsUseCase
import com.mercadolibre.dashboard.detail.DetailViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureDetailModule = module {
    factory { GetReleaseMetricsUseCase(get()) }
    viewModel { DetailViewModel(get(), get()) }
}