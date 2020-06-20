package com.mercadolibre.dashboard.di

import com.mercadolibre.dashboard.home.di.featureHomeModule
import com.mercadolibre.dashboard.local.di.localModule
import com.mercadolibre.dashboard.remote.di.createRemoteModule
import com.mercadolibre.dashboard.repository.di.repositoryModule

val appComponent =
    listOf(createRemoteModule("http://mobile.ml.com/dashboard/"), repositoryModule, featureHomeModule, localModule)