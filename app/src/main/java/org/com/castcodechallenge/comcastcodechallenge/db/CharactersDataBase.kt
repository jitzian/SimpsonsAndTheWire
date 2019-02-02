package org.com.castcodechallenge.comcastcodechallenge.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants
import org.com.castcodechallenge.comcastcodechallenge.db.dao.CharactersDao
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character

@Database(
    entities = [Character::class],
    exportSchema = false,
    version = GlobalConstants.dataBaseVersion
)
abstract class CharactersDataBase : RoomDatabase() {

    abstract fun charactersDao(): CharactersDao

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