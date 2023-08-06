package net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class CommunityData(
    @SerializedName("facebook_likes")
    val facebookLikes: Any?, // null
    @SerializedName("reddit_accounts_active_48h")
    val redditAccountsActive48h: Int?, // 1848
    @SerializedName("reddit_average_comments_48h")
    val redditAverageComments48h: Int?, // 490
    @SerializedName("reddit_average_posts_48h")
    val redditAveragePosts48h: Double?, // 10.4
    @SerializedName("reddit_subscribers")
    val redditSubscribers: Int?, // 5688671
    @SerializedName("telegram_channel_user_count")
    val telegramChannelUserCount: Any?, // null
    @SerializedName("twitter_followers")
    val twitterFollowers: Int? // 5941210
)