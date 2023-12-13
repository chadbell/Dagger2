package com.techyourchance.dagger2course.common.dependencyInjection.presentation

import androidx.lifecycle.ViewModel
import com.techyourchance.dagger2course.common.dependencyInjection.service.ViewModelKey
import com.techyourchance.dagger2course.screens.viewmodel.MyViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {
    @Binds

    // this annotation create a map structure to store the classes
    @IntoMap

    // this is the key of the map with the value being the view model
    @ViewModelKey(MyViewModel::class)
    abstract fun myViewModel(myViewModel: MyViewModel): ViewModel
}
