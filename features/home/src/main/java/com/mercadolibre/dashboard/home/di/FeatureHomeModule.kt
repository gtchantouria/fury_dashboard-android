package com.mercadolibre.dashboard.home.di


import com.mercadolibre.dashboard.features.home.domain.GetReleasesUseCase
import com.mercadolibre.dashboard.home.HomeViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureHomeModule = module {
    factory { GetReleasesUseCase(get()) }
    viewModel { HomeViewModel(get(), get()) }
}
