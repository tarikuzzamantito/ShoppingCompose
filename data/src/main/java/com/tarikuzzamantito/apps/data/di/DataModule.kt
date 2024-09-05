package com.tarikuzzamantito.apps.data.di

import org.koin.dsl.module

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 3:28 PM
 */
val dataModule = module {
    includes(networkModule, repositoryModule)
}