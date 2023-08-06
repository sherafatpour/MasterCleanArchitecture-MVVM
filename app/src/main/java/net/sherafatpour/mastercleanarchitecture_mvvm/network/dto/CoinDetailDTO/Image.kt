package net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Image(
    @SerializedName("large")
    val large: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1547033579
    @SerializedName("small")
    val small: String?, // https://assets.coingecko.com/coins/images/1/small/bitcoin.png?1547033579
    @SerializedName("thumb")
    val thumb: String? // https://assets.coingecko.com/coins/images/1/thumb/bitcoin.png?1547033579
)