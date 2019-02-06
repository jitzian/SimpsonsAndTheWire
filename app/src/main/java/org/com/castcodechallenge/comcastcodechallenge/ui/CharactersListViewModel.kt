package org.com.castcodechallenge.comcastcodechallenge.ui

import android.arch.lifecycle.MutableLiveData
import android.view.View
import kotlinx.coroutines.*
import org.com.castcodechallenge.comcastcodechallenge.R
import org.com.castcodechallenge.comcastcodechallenge.api.RestApi
import org.com.castcodechallenge.comcastcodechallenge.api.model.CharactersResult
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants.Companion.format
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants.Companion.noTitleFallback
import org.com.castcodechallenge.comcastcodechallenge.constants.simpsonsQuery
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
    val errorClickListener = View.OnClickListener {
        runBlocking { prepareData() }
    }

    init {
        logger = Logger.getLogger(TAG)
        prepareData()
    }

    private fun prepareData() = GlobalScope.launch {
        val lstDb = retrieveDataFromDB()

        if (!lstDb.isEmpty()) {
            onRetrieveCharactersListSuccess(lstDb)
        } else {
            runBlocking {
                fetchRemoteData()
                delay(2000)
                onRetrieveCharactersListSuccess(retrieveDataFromDB())
            }
        }
    }

    private fun fetchRemoteData() {
        runBlocking {
            withContext(Dispatchers.IO) {
                onRetrieveCharactersListStart()
                restApi.getCharacters(simpsonsQuery, format).enqueue(object : Callback<CharactersResult> {
                    override fun onFailure(call: Call<CharactersResult>, t: Throwable) {
                        logger.severe("$TAG::fetchData::onFailure::${t.message}")
                        onRetrieveCharactersError()
                    }

                    override fun onResponse(call: Call<CharactersResult>, response: Response<CharactersResult>) {
                        logger.severe("$TAG::fetchData::onResponse::${response.body()?.relatedTopics?.size}")
                        response.body()?.relatedTopics?.let { lstRelatedTopics ->
                            for (i in lstRelatedTopics) {
                                with(i) {
                                    insertFetchedDataIntoDb(
                                        Character(
                                            if (!response.body()?.heading.isNullOrEmpty()) response.body()?.heading else noTitleFallback,
                                            icon?.url,
                                            text,
                                            result
                                        )
                                    )
                                }
                            }
                        }
                    }
                })
            }
        }
    }

    private fun insertFetchedDataIntoDb(objToSaveInDb: Character) {
        runBlocking {
            withContext(Dispatchers.IO) {
                charactersDao.insert(objToSaveInDb)
            }
        }
        onRetrieveCharactersListFinish()
    }

    private suspend fun retrieveDataFromDB(): List<Character> = coroutineScope {
        val deferredListOfData = async {
            charactersDao.getAllCharacters
        }
        return@coroutineScope deferredListOfData.await()
    }

    private fun onRetrieveCharactersListStart() {
        loadingVisibility.postValue(View.VISIBLE)
        errorMessage.postValue(null)
    }

    private fun onRetrieveCharactersListFinish() {
        loadingVisibility.postValue(View.GONE)
    }

    private fun onRetrieveCharactersListSuccess(charactersList: List<Character>) = GlobalScope.launch {
        logger.severe("$TAG::onRetrieveCharactersListSuccess::${charactersList.size}")
        withContext(Dispatchers.Main) {
            rvAdapter.updateCharacterList(charactersList)
            onRetrieveCharactersListFinish()
        }
    }

    private fun onRetrieveCharactersError() = GlobalScope.launch {
        withContext(Dispatchers.Main) {
            errorMessage.value = R.string.error_message
        }
    }

}