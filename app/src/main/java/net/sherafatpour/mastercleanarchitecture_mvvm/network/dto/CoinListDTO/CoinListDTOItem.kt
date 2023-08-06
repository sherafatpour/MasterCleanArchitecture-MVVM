package net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinListDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class CoinListDTOItem(
    @SerializedName("ath")
    val ath: Double?, // 4878.26
    @SerializedName("ath_change_percentage")
    val athChangePercentage: Double?, // -57.93708
    @SerializedName("ath_date")
    val athDate: String?, // 2021-11-10T14:24:11.849Z
    @SerializedName("atl")
    val atl: Double?, // 67.81
    @SerializedName("atl_change_percentage")
    val atlChangePercentage: Double?, // 42729.48226
    @SerializedName("atl_date")
    val atlDate: String?, // 2013-07-06T00:00:00.000Z
    @SerializedName("circulating_supply")
    val circulatingSupply: Double?, // 120163084.110252
    @SerializedName("current_price")
    val currentPrice: Double?, // 1831.81
    @SerializedName("fully_diluted_valuation")
    val fullyDilutedValuation: Long?, // 609887116091
    @SerializedName("high_24h")
    val high24h: Double?, // 1836.67
    @SerializedName("id")
    val id: String?, // bitcoin
    @SerializedName("image")
    val image: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1547033579
    @SerializedName("last_updated")
    val lastUpdated: String?, // 2023-08-06T07:24:15.725Z
    @SerializedName("low_24h")
    val low24h: Double?, // 1827.83
    @SerializedName("market_cap")
    val marketCap: Long?, // 564851657411
    @SerializedName("market_cap_change_24h")
    val marketCapChange24h: Double?, // -1873753.3073329926
    @SerializedName("market_cap_change_percentage_24h")
    val marketCapChangePercentage24h: Double?, // 0.07981
    @SerializedName("market_cap_rank")
    val marketCapRank: Int?, // 1
    @SerializedName("max_supply")
    val maxSupply: Double?, // 7984548.63623738
    @SerializedName("name")
    val name: String?, // Bitcoin
    @SerializedName("price_change_24h")
    val priceChange24h: Double?, // 21.83
    @SerializedName("price_change_percentage_24h")
    val priceChangePercentage24h: Double?, // 0.07522
    @SerializedName("roi")
    val roi: Roi?,
    @SerializedName("symbol")
    val symbol: String?, // btc
    @SerializedName("total_supply")
    val totalSupply: Double?, // 120163084.110252
    @SerializedName("total_volume")
    val totalVolume: Double? // 713.03
)