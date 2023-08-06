package net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class MarketData(
    @SerializedName("ath")
    val ath: Ath?,
    @SerializedName("ath_change_percentage")
    val athChangePercentage: AthChangePercentage?,
    @SerializedName("ath_date")
    val athDate: AthDate?,
    @SerializedName("atl")
    val atl: Atl?,
    @SerializedName("atl_change_percentage")
    val atlChangePercentage: AtlChangePercentage?,
    @SerializedName("atl_date")
    val atlDate: AtlDate?,
    @SerializedName("circulating_supply")
    val circulatingSupply: Int?, // 19449325
    @SerializedName("current_price")
    val currentPrice: CurrentPrice?,
    @SerializedName("fdv_to_tvl_ratio")
    val fdvToTvlRatio: Any?, // null
    @SerializedName("fully_diluted_valuation")
    val fullyDilutedValuation: FullyDilutedValuation?,
    @SerializedName("high_24h")
    val high24h: High24h?,
    @SerializedName("last_updated")
    val lastUpdated: String?, // 2023-08-06T07:42:02.580Z
    @SerializedName("low_24h")
    val low24h: Low24h?,
    @SerializedName("market_cap")
    val marketCap: MarketCap?,
    @SerializedName("market_cap_change_24h")
    val marketCapChange24h: Int?, // 646453925
    @SerializedName("market_cap_change_24h_in_currency")
    val marketCapChange24hInCurrency: MarketCapChange24hInCurrency?,
    @SerializedName("market_cap_change_percentage_24h")
    val marketCapChangePercentage24h: Double?, // 0.11457
    @SerializedName("market_cap_change_percentage_24h_in_currency")
    val marketCapChangePercentage24hInCurrency: MarketCapChangePercentage24hInCurrency?,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int?, // 1
    @SerializedName("max_supply")
    val maxSupply: Int?, // 21000000
    @SerializedName("mcap_to_tvl_ratio")
    val mcapToTvlRatio: Any?, // null
    @SerializedName("price_change_24h")
    val priceChange24h: Double?, // 34.68751
    @SerializedName("price_change_24h_in_currency")
    val priceChange24hInCurrency: PriceChange24hInCurrency?,
    @SerializedName("price_change_percentage_14d")
    val priceChangePercentage14d: Double?, // -2.89437
    @SerializedName("price_change_percentage_14d_in_currency")
    val priceChangePercentage14dInCurrency: PriceChangePercentage14dInCurrency?,
    @SerializedName("price_change_percentage_1h_in_currency")
    val priceChangePercentage1hInCurrency: PriceChangePercentage1hInCurrency?,
    @SerializedName("price_change_percentage_1y")
    val priceChangePercentage1y: Double?, // 25.30329
    @SerializedName("price_change_percentage_1y_in_currency")
    val priceChangePercentage1yInCurrency: PriceChangePercentage1yInCurrency?,
    @SerializedName("price_change_percentage_200d")
    val priceChangePercentage200d: Double?, // 36.60807
    @SerializedName("price_change_percentage_200d_in_currency")
    val priceChangePercentage200dInCurrency: PriceChangePercentage200dInCurrency?,
    @SerializedName("price_change_percentage_24h")
    val priceChangePercentage24h: Double?, // 0.11954
    @SerializedName("price_change_percentage_24h_in_currency")
    val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrency?,
    @SerializedName("price_change_percentage_30d")
    val priceChangePercentage30d: Double?, // -3.58292
    @SerializedName("price_change_percentage_30d_in_currency")
    val priceChangePercentage30dInCurrency: PriceChangePercentage30dInCurrency?,
    @SerializedName("price_change_percentage_60d")
    val priceChangePercentage60d: Double?, // 8.25186
    @SerializedName("price_change_percentage_60d_in_currency")
    val priceChangePercentage60dInCurrency: PriceChangePercentage60dInCurrency?,
    @SerializedName("price_change_percentage_7d")
    val priceChangePercentage7d: Double?, // -0.76322
    @SerializedName("price_change_percentage_7d_in_currency")
    val priceChangePercentage7dInCurrency: PriceChangePercentage7dInCurrency?,
    @SerializedName("roi")
    val roi: Any?, // null
    @SerializedName("total_supply")
    val totalSupply: Int?, // 21000000
    @SerializedName("total_value_locked")
    val totalValueLocked: Any?, // null
    @SerializedName("total_volume")
    val totalVolume: TotalVolume?
)