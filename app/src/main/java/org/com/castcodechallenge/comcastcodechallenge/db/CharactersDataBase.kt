package org.com.castcodechallenge.comcastcodechallenge.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
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
}