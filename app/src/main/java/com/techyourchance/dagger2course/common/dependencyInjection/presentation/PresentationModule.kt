package com.techyourchance.dagger2course.common.dependencyInjection.presentation

import androidx.savedstate.SavedStateRegistryOwner
import dagger.Module
import dagger.Provides

@Module
class PresentationModule(private val savedStateRegistryOwner: SavedStateRegistryOwner) {
    @Provides
    fun saveStateRegistryOwner() = savedStateRegistryOwner
}
