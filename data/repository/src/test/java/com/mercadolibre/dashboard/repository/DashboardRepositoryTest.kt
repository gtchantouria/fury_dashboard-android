package com.mercadolibre.dashboard.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.mercadolibre.common_test.rules.CoroutinesMainDispatcherRule
import com.mercadolibre.dashboard.dao.DashboardDao
import com.mercadolibre.dashboard.model.*
import com.mercadolibre.dashboard.remote.DashboardDatasource
import com.mercadolibre.dashboard.repository.utils.Resource
import io.mockk.*
import kotlinx.coroutines.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class DashboardRepositoryTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val coroutinesMainDispatcherRule = CoroutinesMainDispatcherRule()

    // FOR DATA
    private lateinit var observer: Observer<Resource<List<Release>>>
    private lateinit var observerUser: Observer<Resource<Release>>
    private lateinit var dashboardRepository: DashboardRepository
    private val dashboardService = mockk<DashboardDatasource>()
    private val dashboardDao = mockk<DashboardDao>(relaxed = true)

    // FAKE DATA
    val FAKE_RELEASES = listOf(
        Release(
            _id = 1,
            open = true,
            major = 1,
            minor = 0,
            endDevelopmentDate = "02/05/2020",
            flavorId = 1,
            releaseManagerId = 1,
            versionPatches = listOf(
                VersionPatches(
                    _id = 1057,
                    versionCodes = null,
                    number = 0,
                    milestone = 248,
                    status = "not_started",
                    rolloutPercentage = null,
                    releaseId = 1
                )
            ),
            releaseManager = ReleaseManager(
                1,
                Profile("Guille Tchantouria"),
                Token(1),
                "Guille Tchantouria",
                "guille@mail.com",
                "gtachantouria"
            ),
            flavor = Flavor(
                _id = 1,
                display = "Android",
                name = "android",
                repo = "mobile-android",
                owner = "mercadolibre",
                packageName = "com.mercadolibre",
                appId = 1,
                projectId = "57990824e694aa64191bd4ad",
                crashRateThreshold = 0.3,
                canejoUrl = "canejo"
            )
        ),
        Release(
            _id = 2,
            open = true,
            major = 1,
            minor = 1,
            endDevelopmentDate = "03/05/2020",
            flavorId = 1,
            releaseManagerId = 1,
            versionPatches = listOf(
                VersionPatches(
                    _id = 1057,
                    versionCodes = null,
                    number = 0,
                    milestone = 248,
                    status = "not_started",
                    rolloutPercentage = null,
                    releaseId = 1
                )
            ),
            releaseManager = ReleaseManager(
                1,
                Profile("Eze Ferrin"),
                Token(1),
                "Eze Ferrin",
                "eze@mail.com",
                "eferrin"
            ),
            flavor = Flavor(
                _id = 1,
                display = "Android",
                name = "android",
                repo = "mobile-android",
                owner = "mercadolibre",
                packageName = "com.mercadolibre",
                appId = 1,
                projectId = "57990824e694aa64191bd4ad",
                crashRateThreshold = 0.3,
                canejoUrl = "canejo"
            )
        ),
        Release(
            _id = 3,
            open = true,
            major = 1,
            minor = 2,
            endDevelopmentDate = "04/05/2020",
            flavorId = 1,
            releaseManagerId = 1,
            versionPatches = listOf(
                VersionPatches(
                    _id = 1057,
                    versionCodes = null,
                    number = 0,
                    milestone = 248,
                    status = "not_started",
                    rolloutPercentage = null,
                    releaseId = 1
                )
            ),
            releaseManager = ReleaseManager(
                1,
                Profile("Lean Furyk"),
                Token(1),
                "Lean Furyk",
                "lean@mail.com",
                "lfuryk"
            ),
            flavor = Flavor(
                _id = 1,
                display = "Android",
                name = "android",
                repo = "mobile-android",
                owner = "mercadolibre",
                packageName = "com.mercadolibre",
                appId = 1,
                projectId = "57990824e694aa64191bd4ad",
                crashRateThreshold = 0.3,
                canejoUrl = "canejo"
            )
        ),
        Release(
            _id = 4,
            open = true,
            major = 1,
            minor = 3,
            endDevelopmentDate = "05/05/2020",
            flavorId = 1,
            releaseManagerId = 1,
            versionPatches = listOf(
                VersionPatches(
                    _id = 1057,
                    versionCodes = null,
                    number = 0,
                    milestone = 248,
                    status = "not_started",
                    rolloutPercentage = null,
                    releaseId = 1
                )
            ),
            releaseManager = ReleaseManager(
                1,
                Profile("Juani Moli"),
                Token(1),
                "Juani Moli",
                "juani@mail.com",
                "juanimoli"
            ),
            flavor = Flavor(
                _id = 1,
                display = "Android",
                name = "android",
                repo = "mobile-android",
                owner = "mercadolibre",
                packageName = "com.mercadolibre",
                appId = 1,
                projectId = "57990824e694aa64191bd4ad",
                crashRateThreshold = 0.3,
                canejoUrl = "canejo"
            )
        )
    )

    @Before
    fun setUp() {
        observer = mockk(relaxed = true)
        observerUser = mockk(relaxed = true)
        dashboardRepository = DashboardRepositoryImpl(dashboardService, dashboardDao)
    }

    @Test
    fun `Get top users from network`() {
       /* val fakeRelease = FAKE_RELEASES
        //every { dashboardService.getReleases() } returns FAKE_RELEASES
        every { dashboardService.getReleases() } returns FAKE_RELEASES
        coEvery { dashboardDao.getAll() } returns listOf() andThen { fakeRelease }

        runBlocking {
            dashboardRepository.getReleases().observeForever(observer)
        }

        verifyOrder {
            observer.onChanged(Resource.Loading(null)) // Loading from remote source
            observer.onChanged(Resource.Loading(listOf())) // Then trying to load from db (fast temp loading) before load from remote source
            observer.onChanged(Resource.Success(fakeRelease)) // Success
        }

        coVerify(exactly = 1) {
            dashboardDao.saveReleases(fakeRelease)
        }

        confirmVerified(observer)*/
    }
}