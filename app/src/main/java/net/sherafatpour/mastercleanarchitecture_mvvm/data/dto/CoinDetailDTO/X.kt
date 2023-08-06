package net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class X(
    @SerializedName("contract_address")
    val contractAddress: String?,
    @SerializedName("decimal_place")
    val decimalPlace: Any? // null
)