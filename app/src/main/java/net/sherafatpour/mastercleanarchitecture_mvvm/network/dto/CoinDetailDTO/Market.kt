package net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Market(
    @SerializedName("has_trading_incentive")
    val hasTradingIncentive: Boolean?, // false
    @SerializedName("identifier")
    val identifier: String?, // binance
    @SerializedName("name")
    val name: String? // Binance
)