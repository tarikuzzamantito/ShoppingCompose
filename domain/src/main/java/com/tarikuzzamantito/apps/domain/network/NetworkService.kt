package com.tarikuzzamantito.apps.domain.network

import com.tarikuzzamantito.apps.domain.model.Product

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 4:12 PM
 */
interface NetworkService {
    suspend fun getProducts(): ResultWrapper<List<Product>>
}

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T) : ResultWrapper<T>()
    data class Failure(val exception: Exception) : ResultWrapper<Nothing>()
}