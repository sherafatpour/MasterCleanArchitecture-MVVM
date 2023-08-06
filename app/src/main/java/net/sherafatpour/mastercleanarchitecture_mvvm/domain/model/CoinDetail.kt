package net.sherafatpour.mastercleanarchitecture_mvvm.domain.model

data class CoinDetail(
    val name: String?,
    val image: String?,
    val marketCap: Double?,
    val price: Double?,
    val pricePercentageChange: Double?,
    val lowPrice: Double?,
    val highPrice: Double?,
    val description:String,

    )
