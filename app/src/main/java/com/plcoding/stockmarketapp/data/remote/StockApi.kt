package com.plcoding.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings (
        @Query("apikey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "3I8MU9LYLO0CF0ON"
        const val BASE_URL = "https://www.alphavantage.co/"

    }
}