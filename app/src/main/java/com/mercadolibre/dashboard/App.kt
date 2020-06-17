package com.mercadolibre.dashboard

import android.app.Application
import com.mercadolibre.dashboard.di.appComponent
import org.koin.android.ext.android.startKoin

open class App : Application() {
    override fun onCreate() {
        super.onCreate()
        configureDi()
    }

    open fun configureDi() = startKoin(this, provideComponent())

    open fun provideComponent() = appComponent
}