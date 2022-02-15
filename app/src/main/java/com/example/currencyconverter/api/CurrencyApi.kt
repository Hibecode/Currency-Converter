package com.example.currencyconverter.api

import com.example.currencyconverter.data.models.CurrencyResponse
import com.example.currencyconverter.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("api/latest")
    suspend fun getRates(
        @Query("base")
        base: String,
        @Query("access_key" )
        apikey: String = API_KEY
    ): Response<CurrencyResponse>

}