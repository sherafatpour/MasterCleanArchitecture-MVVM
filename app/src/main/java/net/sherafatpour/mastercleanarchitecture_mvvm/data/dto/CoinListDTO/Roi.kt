package net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinListDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Roi(
    @SerializedName("currency")
    val currency: String?, // btc
    @SerializedName("percentage")
    val percentage: Double?, // 8332.818543451516
    @SerializedName("times")
    val times: Double? // 83.32818543451516
)