package org.com.castcodechallenge.comcastcodechallenge.ui.adapter.listeners

import android.view.View
import org.com.castcodechallenge.comcastcodechallenge.ui.CharactersViewModel
import java.util.logging.Logger

class ButtonClickListenerEvent {
    private lateinit var logger: Logger

    fun displayDetails(v: View, viewModel: CharactersViewModel){
        logger = Logger.getLogger(ButtonClickListenerEvent::class.java.simpleName)
        logger.severe("-->> ${v.visibility} - ${viewModel.getText()}")
    }
}