package com.tarikuzzamantito.apps.domain.di

import org.koin.dsl.module

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 3:15 PM
 */
val domainModule = module {
    includes(useCaseModule)
}