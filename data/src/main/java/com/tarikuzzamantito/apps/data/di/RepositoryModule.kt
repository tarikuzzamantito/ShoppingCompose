package com.tarikuzzamantito.apps.data.di

import com.tarikuzzamantito.apps.data.repository.ProductRepositoryImpl
import com.tarikuzzamantito.apps.domain.repository.ProductRepository
import org.koin.dsl.module

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 4:49 PM
 */
val repositoryModule = module {
    single<ProductRepository> {
        ProductRepositoryImpl(get())
    }
}