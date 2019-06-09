package com.example.blankkoin

import android.app.Application
import co.zsmb.rainbowcake.config.Loggers
import co.zsmb.rainbowcake.config.rainbowCake
import co.zsmb.rainbowcake.timber.TIMBER
import com.example.blankkoin.ui.blank.BlankPresenter
import com.example.blankkoin.ui.blank.BlankViewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber

class BlankApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        rainbowCake {
            logger = Loggers.TIMBER
            isDebug = BuildConfig.DEBUG
        }

        Timber.plant(Timber.DebugTree())

        val blankModule = module {
            factory { BlankPresenter() }
            factory { BlankViewModel(get()) }
        }

        startKoin {
            modules(blankModule)
        }
    }

}
