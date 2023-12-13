package com.techyourchance.dagger2course.common.dependnecyinjection.service

import com.techyourchance.dagger2course.common.dependencyInjection.service.ServiceModule
import dagger.Subcomponent

@Subcomponent(modules = [ServiceModule::class])
interface ServiceComponent {

}
