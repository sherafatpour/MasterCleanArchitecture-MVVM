package net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Ticker(
    @SerializedName("base")
    val base: String?, // BTC
    @SerializedName("bid_ask_spread_percentage")
    val bidAskSpreadPercentage: Double?, // 0.011204
    @SerializedName("coin_id")
    val coinId: String?, // bitcoin
    @SerializedName("converted_last")
    val convertedLast: ConvertedLast?,
    @SerializedName("converted_volume")
    val convertedVolume: ConvertedVolume?,
    @SerializedName("is_anomaly")
    val isAnomaly: Boolean?, // false
    @SerializedName("is_stale")
    val isStale: Boolean?, // false
    @SerializedName("last")
    val last: Double?, // 29078.8
    @SerializedName("last_fetch_at")
    val lastFetchAt: String?, // 2023-08-06T07:37:59+00:00
    @SerializedName("last_traded_at")
    val lastTradedAt: String?, // 2023-08-06T07:37:59+00:00
    @SerializedName("market")
    val market: Market?,
    @SerializedName("target")
    val target: String?, // TUSD
    @SerializedName("target_coin_id")
    val targetCoinId: String?, // true-usd
    @SerializedName("timestamp")
    val timestamp: String?, // 2023-08-06T07:37:59+00:00
    @SerializedName("token_info_url")
    val tokenInfoUrl: Any?, // null
    @SerializedName("trade_url")
    val tradeUrl: String?, // https://www.binance.com/en/trade/BTC_TUSD?ref=37754157
    @SerializedName("trust_score")
    val trustScore: String?, // green
    @SerializedName("volume")
    val volume: Double? // 20741.71183
)