package org.com.castcodechallenge.comcastcodechallenge.ui

import android.arch.lifecycle.MutableLiveData
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character

class CharactersViewModel: BaseViewModel(){

    private val headerText = MutableLiveData<String>()
    private val resultText = MutableLiveData<String>()
    private val text = MutableLiveData<String>()
    private val imageUrl = MutableLiveData<String>()

    //This variable is just for checking if info is displayed or not
    private val isExanded: Boolean = false

    fun bind(character: Character){
        headerText.value = character.header
        resultText.value = character.result
        text.value = character.text
        imageUrl.value = character.url
    }

    fun getResultText(): MutableLiveData<String>{
        return resultText
    }

    fun getText(): MutableLiveData<String>{
        return text
    }

    fun getImageUrl(): MutableLiveData<String>{
        return imageUrl
    }

    fun getHeaderText(): MutableLiveData<String>{
        return headerText
    }

}