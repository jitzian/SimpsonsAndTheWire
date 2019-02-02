package org.com.castcodechallenge.comcastcodechallenge.ui

import android.arch.lifecycle.MutableLiveData
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.com.castcodechallenge.comcastcodechallenge.R
import org.com.castcodechallenge.comcastcodechallenge.api.RestApi
import org.com.castcodechallenge.comcastcodechallenge.api.model.CharactersResult
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants.Companion.format
import org.com.castcodechallenge.comcastcodechallenge.db.dao.CharactersDao
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character
import org.com.castcodechallenge.comcastcodechallenge.ui.adapter.RVCharactersAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.logging.Logger
import javax.inject.Inject

class CharactersListViewModel(private val charactersDao: CharactersDao): BaseViewModel(){

    private var TAG = CharactersListViewModel::class.java.simpleName
    @Inject
    lateinit var restApi: RestApi

    val rvAdapter = RVCharactersAdapter()

    //MutableData
    var loadingVisibility: MutableLiveData<Int> = MutableLiveData()
    var errorMessage: MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { fetchData() }

    init{
        logger = Logger.getLogger(TAG)
        fetchData()
    }

    private fun fetchData() = GlobalScope.launch {
        val deferredCharactersResult = async {
            restApi.getCharacters("simpsons characters", format).enqueue(object : Callback<CharactersResult> {
                override fun onFailure(p0: Call<CharactersResult>, throwable: Throwable) {
                    logger.severe("$TAG::fetchData::onFailure::${throwable.message}")
                }

                override fun onResponse(call: Call<CharactersResult>, response: Response<CharactersResult>) {
//                    logger.severe("$TAG::onResponse::${response.body()?.relatedTopics?.size}")
                    logger.severe("$TAG::onResponse::${response.body()?.definitionSource}")

                }

            })
        }
        deferredCharactersResult.await()

    }

    private fun onRetrieveCharactersListStart(){
        loadingVisibility.value = View.VISIBLE
        errorMessage.value = null
    }

    private fun onRetrieveCharactersListFinish(){
        loadingVisibility.value = View.GONE
    }

    private fun onRetrieveCharactersListSuccess(charactersList: List<Character>){
        rvAdapter.updateCharacterList(charactersList)
    }

    private fun onRetrieveCharactersError(){
        errorMessage.value = R.string.error_message
    }

}