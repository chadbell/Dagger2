package com.techyourchance.dagger2course

import android.app.Application
import com.techyourchance.dagger2course.common.dependencyInjection.app.AppComponent
import com.techyourchance.dagger2course.common.dependencyInjection.app.AppModule
import com.techyourchance.dagger2course.common.dependencyInjection.app.DaggerAppComponent

class MyApplication : Application() {
    public val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
    override fun onCreate() {
        super.onCreate()
    }
}
