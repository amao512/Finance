package com.aslnstbk.finance

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FinanceApp : Application() {

    override fun onCreate() {
        super.onCreate()

    }
}