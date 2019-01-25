package org.com.castcodechallenge.comcastcodechallenge.api

import org.com.castcodechallenge.comcastcodechallenge.api.model.CharactersResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {

    @GET("/")
    fun getCharacters(
        @Query("q") query: String,
        @Query("format") format: String
    ): Call<CharactersResult>

}
