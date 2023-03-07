package com.example.dessertclickerfinal

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ClickerApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}