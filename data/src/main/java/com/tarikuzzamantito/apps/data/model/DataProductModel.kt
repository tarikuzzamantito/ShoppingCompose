package com.tarikuzzamantito.apps.data.model

import com.tarikuzzamantito.apps.domain.model.Product
import kotlinx.serialization.Serializable

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 4:31 PM
 */
@Serializable
data class DataProductModel(
    val id: Long,
    val title: String,
    val price: Double,
    val category: String,
    val description: String,
    val image: String
) {
    fun toProduct() = Product(
        id = id,
        title = title,
        price = price,
        category = category,
        description = description,
        image = image
    )
}