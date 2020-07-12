package com.mercadolibre.dashboard.remote

import com.mercadolibre.dashboard.remote.base.RemoteTest
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test

class RemoteServiceTest {

    private val service = RemoteTest.createServiceTest()

    /**
     * This is just an example, to test the real request. It doesn't work as a test, because, it could be change.
     */
    @Test
    fun `validate release data`() {

        runBlocking {
            val metrics = service.getReleaseMetrics2(1204)

            assertEquals(42, metrics[0].errorsIntroducedCount)
            assertEquals(324, metrics[0].errorsSeenCount)
        }
    }

}