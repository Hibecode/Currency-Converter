package com.example.currencyconverter.data.models

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