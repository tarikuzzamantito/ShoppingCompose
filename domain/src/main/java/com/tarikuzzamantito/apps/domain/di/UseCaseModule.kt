package com.tarikuzzamantito.apps.domain.di

import com.tarikuzzamantito.apps.domain.usecase.GetProductUseCase
import org.koin.dsl.module

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 5:22 PM
 */
val useCaseModule = module {
    factory {
        GetProductUseCase(get())
    }
}