package com.mercadolibre.dashboard.repository.utils

import android.util.Log
import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.coroutines.coroutineContext

/**
 * [ResultType]: Type for the Resource data.
 * [RequestType]: Type for the API response.
 */
abstract class NetworkBoundResource<ResultType, RequestType> {
    private val result = MutableLiveData<Resource<ResultType>>()
    private val supervisorJob = SupervisorJob()

    suspend fun build(): NetworkBoundResource<ResultType, RequestType> {
        withContext(Dispatchers.Main) { result.value =
            Resource.Loading(null)
        }
        CoroutineScope(coroutineContext).launch(supervisorJob) {
            val dbResult = loadFromDb()
            if (shouldFetch(dbResult)) {
                try {
                    fetchFromNetwork(dbResult)
                } catch (e: Exception) {
                    Log.e("NetworkBoundResource", "An error happened: $e")
                    setValue(Resource.Error(e, loadFromDb()))
                }
            } else {
                Log.d(NetworkBoundResource::class.java.name, "Return data from local database")
                setValue(Resource.Success(dbResult))
            }
        }
        return this
    }

    fun asLiveData() = result as LiveData<Resource<ResultType>>

    protected suspend fun fetchFromNetwork(dbResult: ResultType) {
        Log.d(NetworkBoundResource::class.java.name, "Fetch data from network")
        setValue(Resource.Loading(dbResult)) // return last value quickly to have a better user experience.
        val apiResponse = createCallAsync()
        Log.e(NetworkBoundResource::class.java.name, "Data fetched from network")
        saveCallResults(processResponse(apiResponse))
        setValue(Resource.Success(loadFromDb()))
    }

    @MainThread
    private fun setValue(value: Resource<ResultType>) {
        Log.d(NetworkBoundResource::class.java.name, "Resource: ")
        if (result.value != value) result.postValue(value)
    }

    @WorkerThread
    abstract fun processResponse(apiResponse: RequestType): ResultType

    @MainThread
    abstract suspend fun createCallAsync(): RequestType

    @WorkerThread
    protected abstract suspend fun saveCallResults(items: ResultType)

    @MainThread
    abstract fun loadFromDb(): ResultType

    @MainThread
    protected abstract fun shouldFetch(data: ResultType?): Boolean
    
    
}