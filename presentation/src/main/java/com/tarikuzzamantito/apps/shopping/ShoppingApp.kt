package com.tarikuzzamantito.apps.shopping

import android.app.Application
import com.tarikuzzamantito.apps.data.di.dataModule
import com.tarikuzzamantito.apps.domain.di.domainModule
import com.tarikuzzamantito.apps.shopping.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Tarikuzzaman Tito on 9/5/2024 3:33 PM
 */
class ShoppingApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShoppingApp)
            modules(
                listOf(
                    presentationModule,
                    domainModule,
                    dataModule
                )
            )
        }
    }
}