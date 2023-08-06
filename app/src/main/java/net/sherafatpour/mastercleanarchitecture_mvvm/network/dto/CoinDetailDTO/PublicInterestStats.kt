package net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class PublicInterestStats(
    @SerializedName("alexa_rank")
    val alexaRank: Int?, // 9440
    @SerializedName("bing_matches")
    val bingMatches: Any? // null
)