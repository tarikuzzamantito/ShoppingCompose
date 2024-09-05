package com.tarikuzzamantito.apps.domain.repository

import com.tarikuzzamantito.apps.domain.model.Product
import com.tarikuzzamantito.apps.domain.network.ResultWrapper

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 4:40 PM
 */
interface ProductRepository {
    suspend fun getProducts(): ResultWrapper<List<Product>>
}