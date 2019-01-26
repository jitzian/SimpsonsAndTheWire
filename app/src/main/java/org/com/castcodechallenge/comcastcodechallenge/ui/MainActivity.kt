package org.com.castcodechallenge.comcastcodechallenge.ui

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.com.castcodechallenge.comcastcodechallenge.R
import org.com.castcodechallenge.comcastcodechallenge.api.RestApi
import org.com.castcodechallenge.comcastcodechallenge.api.model.CharactersResult
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants.Companion.format
import org.com.castcodechallenge.comcastcodechallenge.dependency.injection.components.DaggerViewModelInjector
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.util.logging.Logger
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private var TAG = MainActivity::class.java.simpleName
    private lateinit var restApi: RestApi
    private lateinit var log: Logger


    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        log = Logger.getLogger(TAG)

        setupInjection()
        fetchDataFromApi()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun setupInjection(){
        DaggerViewModelInjector.builder()
            .build()
            .inject(this)
        restApi = retrofit.create(RestApi::class.java)



    }

    private fun fetchDataFromApi() = GlobalScope.launch {
        val deferredCharacters = async {
            restApi.getCharacters("simpsons characters", format).enqueue(object : Callback<CharactersResult> {
                override fun onFailure(call: Call<CharactersResult>, t: Throwable) {
                    log.severe("$TAG::onFailure::${t.message}")
                }

                override fun onResponse(call: Call<CharactersResult>, response: Response<CharactersResult>) {
                    log.severe("$TAG::onResponse::${response.body()?.results}")
                }
            }
            )

//        deferredCharacters.await()
//        log.severe("${deferredCharacters.await().body()?.relatedTopics?.size}")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
