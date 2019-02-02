package org.com.castcodechallenge.comcastcodechallenge.ui

import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.view.View
import kotlinx.coroutines.*
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

class CharactersListViewModel(private val charactersDao: CharactersDao) : BaseViewModel() {

    private var TAG = CharactersListViewModel::class.java.simpleName
    @Inject
    lateinit var restApi: RestApi

    val rvAdapter = RVCharactersAdapter()

    //MutableData
    var loadingVisibility: MutableLiveData<Int> = MutableLiveData()
    var errorMessage: MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { fetchData() }

    init {
        logger = Logger.getLogger(TAG)
        fetchData()
        onRetrieveCharactersListStart()
    }

    private fun fetchData() = GlobalScope.launch {

        withContext(Dispatchers.Main) {


            val deferredCharactersResult = async {
                restApi.getCharacters("simpsons characters", format).enqueue(object : Callback<CharactersResult> {
                    override fun onFailure(call: Call<CharactersResult>, t: Throwable) {
                        logger.severe("$TAG::fetchData::onFailure::${t.message}")
                        onRetrieveCharactersError()
                    }

                    override fun onResponse(call: Call<CharactersResult>, response: Response<CharactersResult>) {
                        logger.severe("$TAG::fetchData::onResponse::${response.body()?.relatedTopics?.size}")

                        response.body()?.let { fetchResult ->
                            fetchResult.relatedTopics.let { lstRelatedTopics ->
                                if (lstRelatedTopics != null) {
                                    for (i in lstRelatedTopics) {
                                        with(i) {
                                            saveFetchedData(Character(icon?.url, text, result))
                                        }
                                    }
                                }

                            }
                        }
                    }

                })
            }
            deferredCharactersResult.await()

        }

    }

    private fun saveFetchedData(objToSaveInDb: Character) = GlobalScope.launch {
        async {
            charactersDao.insert(objToSaveInDb)
        }
        withContext(Dispatchers.Main){
            onRetrieveCharactersListFinish()
        }
    }

    private fun onRetrieveCharactersListStart() = GlobalScope.launch{
        withContext(Dispatchers.Main){
            loadingVisibility.value = View.VISIBLE
            errorMessage.value = null
        }
    }

    private fun onRetrieveCharactersListFinish() = GlobalScope.launch{
        withContext(Dispatchers.Main){
            loadingVisibility.value = View.GONE
        }
    }

    private fun onRetrieveCharactersListSuccess(charactersList: List<Character>) {
        rvAdapter.updateCharacterList(charactersList)
    }

    private fun onRetrieveCharactersError() = GlobalScope.launch{
        withContext(Dispatchers.Main){
            errorMessage.value = R.string.error_message
        }
    }

}