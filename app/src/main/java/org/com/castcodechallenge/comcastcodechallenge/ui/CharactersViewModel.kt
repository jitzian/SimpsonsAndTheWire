package org.com.castcodechallenge.comcastcodechallenge.ui

import android.arch.lifecycle.MutableLiveData
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character
import org.com.castcodechallenge.comcastcodechallenge.ui.adapter.listeners.ButtonClickListenerEvent

class CharactersViewModel: BaseViewModel(){

    private val headerText = MutableLiveData<String>()
    private val resultText = MutableLiveData<String>()
    private val text = MutableLiveData<String>()
    private val imageUrl = MutableLiveData<String>()
    private val isExpanded = MutableLiveData<Boolean>()
    private val buttonClickListenerEvent = ButtonClickListenerEvent()

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

    fun getIsExpanded(): MutableLiveData<Boolean>{
        return isExpanded
    }

    fun getButtonClickListenerEvent(): ButtonClickListenerEvent{
        return buttonClickListenerEvent
    }


}