package com.tarikuzzamantito.apps.domain.model

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 4:16 PM
 */
data class Product(
    val id: Long,
    val title: String,
    val price: Double,
    val category: String,
    val description: String,
    val image: String
) {
    val priceString: String
        get() = "$price"
}
