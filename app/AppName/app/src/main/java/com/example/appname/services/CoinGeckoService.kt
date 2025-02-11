package com.example.appname.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CoinGeckoService {
    @GET("coins/solana")
    suspend fun getSolanaData(): SolanaData
}

data class SolanaData(
    val market_data: MarketData
)

data class MarketData(
    val current_price: Map<String, Double>,
    val market_cap: Map<String, Double>,
    val total_volume: Map<String, Double>
)

class CoinGeckoClient {
    companion object {
        private const val BASE_URL = "https://api.coingecko.com/api/v3/"

        fun create(): CoinGeckoService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(CoinGeckoService::class.java)
        }
    }
}