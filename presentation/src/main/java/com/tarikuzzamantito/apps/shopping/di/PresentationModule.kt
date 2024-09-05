package com.tarikuzzamantito.apps.shopping.di

import org.koin.dsl.module

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 3:32 PM
 */
val presentationModule = module {
    includes(viewMOdelModule)
}