package org.com.castcodechallenge.comcastcodechallenge.db

import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants

abstract class CharactersDataBase : RoomDatabase() {



    companion object {
        @Volatile
        private var INSTANCE: CharactersDataBase? = null

        fun getInstance(context: Context): CharactersDataBase? {
            if (INSTANCE == null) {
                synchronized(CharactersDataBase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        CharactersDataBase::class.java, GlobalConstants.dataBaseName
                    ).fallbackToDestructiveMigration().build()
                }
            }
            return INSTANCE
        }

    }

}