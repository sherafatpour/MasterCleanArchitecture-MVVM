package net.sherafatpour.mastercleanarchitecture_mvvm.data.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import net.sherafatpour.mastercleanarchitecture_mvvm.domain.model.CoinDetail

@Keep
data class CoinDetailDTO(
    @SerializedName("additional_notices")
    val additionalNotices: List<Any?>?,
    @SerializedName("asset_platform_id")
    val assetPlatformId: Any?, // null
    @SerializedName("block_time_in_minutes")
    val blockTimeInMinutes: Int?, // 10
    @SerializedName("categories")
    val categories: List<String?>?,
    @SerializedName("coingecko_rank")
    val coingeckoRank: Int?, // 1
    @SerializedName("coingecko_score")
    val coingeckoScore: Double?, // 83.151
    @SerializedName("community_data")
    val communityData: CommunityData?,
    @SerializedName("community_score")
    val communityScore: Double?, // 83.341
    @SerializedName("country_origin")
    val countryOrigin: String?,
    @SerializedName("description")
    val description: Description?,
    @SerializedName("detail_platforms")
    val detailPlatforms: DetailPlatforms?,
    @SerializedName("developer_data")
    val developerData: DeveloperData?,
    @SerializedName("developer_score")
    val developerScore: Double?, // 99.241
    @SerializedName("genesis_date")
    val genesisDate: String?, // 2009-01-03
    @SerializedName("hashing_algorithm")
    val hashingAlgorithm: String?, // SHA-256
    @SerializedName("id")
    val id: String?, // bitcoin
    @SerializedName("image")
    val image: Image?,
    @SerializedName("last_updated")
    val lastUpdated: String?, // 2023-08-06T07:42:02.580Z
    @SerializedName("links")
    val links: Links?,
    @SerializedName("liquidity_score")
    val liquidityScore: Double?, // 100.011
    @SerializedName("localization")
    val localization: Localization?,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int?, // 1
    @SerializedName("market_data")
    val marketData: MarketData?,
    @SerializedName("name")
    val name: String?, // Bitcoin
    @SerializedName("platforms")
    val platforms: Platforms?,
    @SerializedName("public_interest_score")
    val publicInterestScore: Double?, // 0.073
    @SerializedName("public_interest_stats")
    val publicInterestStats: PublicInterestStats?,
    @SerializedName("public_notice")
    val publicNotice: Any?, // null
    @SerializedName("sentiment_votes_down_percentage")
    val sentimentVotesDownPercentage: Double?, // 28.29
    @SerializedName("sentiment_votes_up_percentage")
    val sentimentVotesUpPercentage: Double?, // 71.71
    @SerializedName("status_updates")
    val statusUpdates: List<Any?>?,
    @SerializedName("symbol")
    val symbol: String?, // btc
    @SerializedName("tickers")
    val tickers: List<Ticker?>?,
    @SerializedName("watchlist_portfolio_users")
    val watchlistPortfolioUsers: Int? // 1324931
) {

    fun toCoinDetail(): CoinDetail = CoinDetail(
        name = name,
        image = image?.large,
        marketCap = marketData?.marketCap?.usd?.toDouble(),
        price = marketData?.low24h?.usd?.toDouble(),
        pricePercentageChange = marketData?.priceChangePercentage24h,
        lowPrice = marketData?.low24h?.usd?.toDouble(),
        highPrice = marketData?.high24h?.usd?.toDouble(),
        description = description?.en.toString()
    )
}