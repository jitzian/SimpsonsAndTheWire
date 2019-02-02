package org.com.castcodechallenge.comcastcodechallenge.utils

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants
import org.com.castcodechallenge.comcastcodechallenge.db.CharactersDataBase
import org.com.castcodechallenge.comcastcodechallenge.ui.CharactersListViewModel

class ViewModelFactory(private val activity: AppCompatActivity): ViewModelProvider.Factory{

    @Throws(IllegalArgumentException::class)
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CharactersListViewModel::class.java)) {
            val db = Room.databaseBuilder(activity.applicationContext,
                CharactersDataBase::class.java, GlobalConstants.dataBaseName)
                .build()
            @Suppress("UNCHECKED_CAST")
            return CharactersListViewModel(db.charactersDao()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}