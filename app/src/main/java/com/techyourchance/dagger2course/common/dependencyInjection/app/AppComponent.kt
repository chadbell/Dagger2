package com.techyourchance.dagger2course.common.dependencyInjection.app

import com.techyourchance.dagger2course.common.dependencyInjection.activity.ActivityComponent
import com.techyourchance.dagger2course.common.dependencyInjection.service.ServiceModule
import com.techyourchance.dagger2course.common.dependnecyinjection.service.ServiceComponent
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun newActivityComponentBuilder(): ActivityComponent.Builder

    fun newServiceComponent(serviceModule: ServiceModule): ServiceComponent
}
