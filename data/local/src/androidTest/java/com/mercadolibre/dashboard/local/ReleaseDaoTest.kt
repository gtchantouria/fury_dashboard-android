package com.mercadolibre.dashboard.local

import android.util.JsonReader
import com.mercadolibre.dashboard.local.base.BaseTest
import com.mercadolibre.dashboard.model.*
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.File

class ReleaseDaoTest : BaseTest() {

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

    override fun setUp() {
        super.setUp()
        fillDatabase()
    }

    private fun fillDatabase() {
        runBlocking {
            database.releaseDao().saveReleases(FAKE_RELEASES)
        }
    }

    private fun getFileFromPath(fileName: String): File {
        val classLoader: ClassLoader = this.javaClass.classLoader
        val url = classLoader.getResource(fileName)
        return File(url.file)
    }

    @Test
    fun fileObjectShouldNotBeNull() {
        val file: File = getFileFromPath("dashboard_releases2.json")
        Assert.assertNotNull(file)
    }

    @Test
    fun JsonReaderTest() {
        val jsonFile = ClassLoader.getSystemResource("dashboard_releases2.json").readText()
        Assert.assertNotNull(jsonFile)
    }

    @Test
    fun getTopUsersFromDb() = runBlocking {
        val releases = database.releaseDao().getAll()
        assertEquals(4, releases.size)
    }


    private fun compareTwoUsers(release: Release, releaseToTest: Release) {
        Assert.assertEquals(release._id, releaseToTest._id)
    }
}