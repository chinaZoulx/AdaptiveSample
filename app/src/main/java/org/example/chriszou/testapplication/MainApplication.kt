package org.example.chriszou.testapplication

import android.app.Application
import org.quick.component.QuickAndroid

class MainApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        QuickAndroid.init(this)
    }
}