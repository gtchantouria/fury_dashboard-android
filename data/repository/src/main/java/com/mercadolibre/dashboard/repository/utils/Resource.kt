package com.mercadolibre.dashboard.repository.utils

// A generic class that contains data and status about loading this data.
// Google recomendation link: https://developer.android.com/jetpack/docs/guide#addendum
data class Resource<out T>(
    val status: Status,
    val data: T? = null,
    val error: Throwable? = null
) {
    companion object {
        fun <T> Success(data: T?): Resource<T> {
            return Resource(
                Status.SUCCESS,
                data,
                null
            )
        }

        fun <T> Error(error: Throwable, data: T?): Resource<T> {
            return Resource(
                Status.ERROR,
                data,
                error
            )
        }

        fun <T> Loading(data: T?): Resource<T> {
            return Resource(
                Status.LOADING,
                data,
                null
            )
        }
    }

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }
}