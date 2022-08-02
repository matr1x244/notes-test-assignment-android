package com.notes

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import com.notes.di.DependencyManager

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DependencyManager.init(this)
    }
}

val Context.app: App
    get() = applicationContext as App

val Fragment.app: App
    get() = requireActivity().app
