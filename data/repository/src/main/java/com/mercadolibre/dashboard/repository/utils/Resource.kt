package com.mercadolibre.dashboard.repository.utils

// A generic class that contains data and status about loading this data.
// Google recomendation link: https://developer.android.com/jetpack/docs/guide#addendum
sealed class Resource<T>(
    val data: T? = null,
    val error: Throwable? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(error: Throwable, data: T? = null) : Resource<T>(data, error)
}