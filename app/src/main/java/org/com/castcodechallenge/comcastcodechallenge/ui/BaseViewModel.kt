package org.com.castcodechallenge.comcastcodechallenge.ui

import android.arch.lifecycle.ViewModel
import org.com.castcodechallenge.comcastcodechallenge.dependency.injection.components.DaggerViewModelInjector
import org.com.castcodechallenge.comcastcodechallenge.dependency.injection.modules.NetworkModule

abstract class BaseViewModel: ViewModel(){

    private val injector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule())
        .build()

    init{
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject(){
        when(this){
            is CharactersViewModel -> injector.inject(this)
        }
    }

}