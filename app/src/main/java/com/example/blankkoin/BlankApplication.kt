package com.example.blankkoin

import android.app.Application
import com.example.blankkoin.ui.UIModule
import org.koin.core.context.startKoin

class BlankApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(UIModule)
        }
    }

}
