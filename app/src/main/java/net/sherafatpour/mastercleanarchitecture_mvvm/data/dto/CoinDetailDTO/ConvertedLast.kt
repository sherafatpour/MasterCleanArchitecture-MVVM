package net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ConvertedLast(
    @SerializedName("btc")
    val btc: Double?, // 1.000088
    @SerializedName("eth")
    val eth: Double?, // 15.856485
    @SerializedName("usd")
    val usd: Int? // 29047
)