package net.sherafatpour.mastercleanarchitecture_mvvm.domain.repository

import net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO.CoinDetailDTO
import net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinListDTO.CoinListDTO

interface CoinRepository {
    suspend fun getAllCoins():CoinListDTO
    suspend fun getCoinById(id:String):CoinDetailDTO
}