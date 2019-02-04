package org.com.castcodechallenge.comcastcodechallenge.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import org.com.castcodechallenge.comcastcodechallenge.constants.selectAllFromCharacters
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character

@Dao
interface CharactersDao {
    @get:Query(selectAllFromCharacters)
    val getAllCharacters: List<Character>

    @Insert(onConflict = REPLACE)
    fun insert(character: Character)
}