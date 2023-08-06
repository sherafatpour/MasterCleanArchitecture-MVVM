package net.sherafatpour.mastercleanarchitecture_mvvm.network.api

import net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinDetailDTO.CoinDetailDTO
import net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinListDTO.CoinListDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinGeckoApi {

    
@GET("/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false&locale=en")
suspend fun getCoins():CoinListDTO


    @GET("/v3/coins/{id}")
    suspend fun getCoinById(@Path("id")id:String):CoinDetailDTO



}