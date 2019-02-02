package org.com.castcodechallenge.comcastcodechallenge.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character

@Dao
interface CharactersDao {

    @get:Query("SELECT * FROM characters")
    val getAllCharacters: List<Character>

    @Insert(onConflict = REPLACE)
//    fun insert(vararg character: Character)
    fun insert(character: Character)

}