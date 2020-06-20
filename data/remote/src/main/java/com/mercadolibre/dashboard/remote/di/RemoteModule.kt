package com.mercadolibre.dashboard.remote.di

import com.mercadolibre.dashboard.remote.DashboardDatasource
import com.mercadolibre.dashboard.remote.DashboardService
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun createRemoteModule(baseUrl: String) = module {

    single {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory { get<Retrofit>().create(DashboardService::class.java) }
    factory { DashboardDatasource(get()) }
}