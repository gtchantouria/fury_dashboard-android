package com.mercadolibre.dashboard.di

import com.mercadolibre.dashboard.database.DashboardDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

private const val DATABASE = "DATABASE"

val localModule = module {
    single(DATABASE) { DashboardDatabase.getDatabase(androidContext())}
    factory { (get(DATABASE) as DashboardDatabase).releaseDao() }
}