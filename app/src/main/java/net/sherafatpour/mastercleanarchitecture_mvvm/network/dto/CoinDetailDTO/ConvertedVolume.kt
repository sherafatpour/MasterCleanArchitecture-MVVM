package net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ConvertedVolume(
    @SerializedName("btc")
    val btc: Double?, // 111.126
    @SerializedName("eth")
    val eth: Double?, // 35.785181
    @SerializedName("usd")
    val usd: Double? // 16216.65
)