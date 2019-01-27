package org.com.castcodechallenge.comcastcodechallenge.dependency.injection.modules

import dagger.Module
import dagger.Provides
import dagger.Reusable
import org.com.castcodechallenge.comcastcodechallenge.api.RestApi
import org.com.castcodechallenge.comcastcodechallenge.constants.GlobalConstants.Companion.baseUrl
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class NetworkModule {

    @Provides
    @Reusable
    fun proveidesApi(retrofit: Retrofit): RestApi {
        return retrofit.create(RestApi::class.java)
    }

    @Provides
    @Reusable
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

}