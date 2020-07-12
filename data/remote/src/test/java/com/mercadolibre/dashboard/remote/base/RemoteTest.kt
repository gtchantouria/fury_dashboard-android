package com.mercadolibre.dashboard.remote.base

import com.mercadolibre.dashboard.remote.DashboardService
import org.koin.test.KoinTest
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RemoteTest : KoinTest {

    fun createServiceTest(): DashboardService {

        var retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://mobile.ml.com/dashboard/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(DashboardService::class.java)
    }
}