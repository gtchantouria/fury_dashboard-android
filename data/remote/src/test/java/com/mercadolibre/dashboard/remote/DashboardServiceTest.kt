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

            assertEquals(433, releases.get(0)._id)
            assertEquals(10, releases.get(0).major)
            assertEquals(107, releases.get(0).minor)
        }
    }
}