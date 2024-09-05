package com.tarikuzzamantito.apps.data.repository

import com.tarikuzzamantito.apps.domain.model.Product
import com.tarikuzzamantito.apps.domain.network.NetworkService
import com.tarikuzzamantito.apps.domain.network.ResultWrapper
import com.tarikuzzamantito.apps.domain.repository.ProductRepository

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 4:41 PM
 */
class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProducts(): ResultWrapper<List<Product>> {
        return networkService.getProducts()
    }
}