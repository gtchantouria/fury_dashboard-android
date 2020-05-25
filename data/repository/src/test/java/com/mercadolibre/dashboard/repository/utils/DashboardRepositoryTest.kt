package com.mercadolibre.dashboard.repository.utils

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Rule

@ExperimentalCoroutinesApi
class DashboardRepositoryTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    //val coroutinesMainDispatcherRule = CoroutinesMainDispatcherRule()
}