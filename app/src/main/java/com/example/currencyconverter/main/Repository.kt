package com.example.currencyconverter.main

import com.example.currencyconverter.data.models.CurrencyResponse
import com.example.currencyconverter.util.Resource

interface Repository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}