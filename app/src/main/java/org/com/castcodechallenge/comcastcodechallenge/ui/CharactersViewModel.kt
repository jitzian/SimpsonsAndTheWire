package org.com.castcodechallenge.comcastcodechallenge.ui

import android.arch.lifecycle.MutableLiveData
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character

class CharactersViewModel: BaseViewModel(){

    private val resultText = MutableLiveData<String>()
    private val text = MutableLiveData<String>()
    private val imageUrl = MutableLiveData<String>()

    fun bind(character: Character){
        resultText.value = character.result
        text.value = character.text
        imageUrl.value = character.text
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

}