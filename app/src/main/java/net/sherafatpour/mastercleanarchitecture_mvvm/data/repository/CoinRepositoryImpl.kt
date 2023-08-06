package net.sherafatpour.mastercleanarchitecture_mvvm.data.repository

import net.sherafatpour.mastercleanarchitecture_mvvm.data.CoinGeckoApi
import net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO.CoinDetailDTO
import net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinListDTO.CoinListDTO
import net.sherafatpour.mastercleanarchitecture_mvvm.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val coinApi: CoinGeckoApi) : CoinRepository {
    override suspend fun getAllCoins(): CoinListDTO {
        return coinApi.getCoins()
    }

    override suspend fun getCoinById(id: String): CoinDetailDTO {
        return coinApi.getCoinById(id = id)
    }
}