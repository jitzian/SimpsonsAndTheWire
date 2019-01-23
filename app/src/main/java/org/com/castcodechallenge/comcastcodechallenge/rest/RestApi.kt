package org.com.castcodechallenge.comcastcodechallenge.rest

import org.com.castcodechallenge.comcastcodechallenge.rest.model.CharactersResult
import retrofit2.Call
import retrofit2.http.GET

interface RestApi {

    @GET()
    fun getCharacters(): Call<CharactersResult>

}
