package com.tarikuzzamantito.apps.domain.usecase

import com.tarikuzzamantito.apps.domain.repository.ProductRepository

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 5:20 PM
 */
class GetProductUseCase(private val repository: ProductRepository) {
    suspend fun execute() = repository.getProducts()
}