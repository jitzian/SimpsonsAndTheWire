package org.com.castcodechallenge.comcastcodechallenge.dependency.injection.components

import dagger.Component
import org.com.castcodechallenge.comcastcodechallenge.ui.MainActivity
import org.com.castcodechallenge.comcastcodechallenge.dependency.injection.modules.NetworkModule
import org.com.castcodechallenge.comcastcodechallenge.ui.CharactersListViewModel
import org.com.castcodechallenge.comcastcodechallenge.ui.CharactersViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ViewModelInjector {

    fun inject(mainActivity: MainActivity)
    fun inject(charactersViewModel: CharactersViewModel)
    fun inject(charactersListViewModel: CharactersListViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector
        fun networkModule(networkModule: NetworkModule): Builder
    }

}