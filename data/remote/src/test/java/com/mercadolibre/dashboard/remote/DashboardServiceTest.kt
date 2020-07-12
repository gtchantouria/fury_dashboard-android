package com.mercadolibre.dashboard.remote

import com.mercadolibre.dashboard.remote.base.BaseTest
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test
import java.net.HttpURLConnection

class DashboardServiceTest: BaseTest() {

    @Test
    fun `validate release data`() {
        mockHttpResponse(mockServer, "dashboard_releases.json", HttpURLConnection.HTTP_OK)

        runBlocking {
            val releases = service.getReleases()

            assertEquals(433, releases[0]._id)
            assertEquals(10, releases[0].major)
            assertEquals(107, releases[0].minor)
        }
    }

    @Test
    fun `validate release metrics data`() {
        mockHttpResponse(mockServer, "release_metrics.json", HttpURLConnection.HTTP_OK)

        runBlocking {
            val metrics = service.getReleaseMetrics(450)

            assertEquals(41, metrics.errorsIntroducedCount)
            assertEquals(310, metrics.errorsSeenCount)
        }
    }
}