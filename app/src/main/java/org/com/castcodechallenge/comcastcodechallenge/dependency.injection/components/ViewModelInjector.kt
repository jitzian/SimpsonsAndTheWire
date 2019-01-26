package org.com.castcodechallenge.comcastcodechallenge.dependency.injection.components

import dagger.Component
import org.com.castcodechallenge.comcastcodechallenge.ui.MainActivity
import org.com.castcodechallenge.comcastcodechallenge.dependency.injection.modules.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ViewModelInjector {

//    fun inject()
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector
        fun networkModule(networkModule: NetworkModule): Builder
    }

}