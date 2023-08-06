package net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class CodeAdditionsDeletions4Weeks(
    @SerializedName("additions")
    val additions: Int?, // 1665
    @SerializedName("deletions")
    val deletions: Int? // -1223
)