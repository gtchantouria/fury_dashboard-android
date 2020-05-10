package com.mercadolibre.dashboard.repository

import androidx.lifecycle.LiveData
import com.mercadolibre.dashboard.dao.DashboardDao
import com.mercadolibre.dashboard.model.Release
import com.mercadolibre.dashboard.remote.DashboardDatasource
import com.mercadolibre.dashboard.repository.utils.NetworkBoundResource
import com.mercadolibre.dashboard.repository.utils.Resource

class DashboardRepositoryImpl( private val datasource: DashboardDatasource,
                               private val dao: DashboardDao): DashboardRepository {

    /**
     * Suspended function that will get a list of [Release]
     * whether in cache (SQLite) or via network (API).
     * [NetworkBoundResource] is responsible to handle this behavior.
     * Google recommendation link: https://developer.android.com/jetpack/docs/guide#addendum
     */
    override suspend fun getReleases(forceRefresh: Boolean): LiveData<Resource<List<Release>>> {
        return object: NetworkBoundResource<List<Release>, List<Release>>() {
            override fun processResponse(apiResponse: List<Release>): List<Release> = apiResponse

            override suspend fun createCallAsync(): List<Release> = datasource.getReleases()

            override suspend fun saveCallResults(items: List<Release>) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun loadFromDb(): List<Release> = dao.getAll()

            override fun shouldFetch(data: List<Release>?): Boolean = data == null || data.isEmpty() || forceRefresh

        }.build().asLiveData()
    }
}