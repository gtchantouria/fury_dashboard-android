package com.mercadolibre.dashboard.repository.di

import com.mercadolibre.dashboard.repository.DashboardRepository
import com.mercadolibre.dashboard.repository.DashboardRepositoryImpl
import com.mercadolibre.dashboard.repository.utils.AppDispatchers
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module.module

val repositoryModule = module {
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
    factory { DashboardRepositoryImpl(get(), get()) as DashboardRepository}
}