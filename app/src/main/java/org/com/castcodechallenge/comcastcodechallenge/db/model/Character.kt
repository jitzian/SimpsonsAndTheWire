package org.com.castcodechallenge.comcastcodechallenge.db.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "characters")
data class Character(
    @ColumnInfo(name = "header") var header: String? = null,
    @ColumnInfo(name = "url") var url: String? = null,
    @ColumnInfo(name = "text") var text: String? = null,
    @ColumnInfo(name = "result") var result: String? = null
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
