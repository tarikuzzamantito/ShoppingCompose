package com.tarikuzzamantito.apps.shopping.di

import com.tarikuzzamantito.apps.shopping.ui.feature.home.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 5:58 PM
 */
val viewMOdelModule = module {
    viewModel {
        HomeViewModel(get())
    }
}