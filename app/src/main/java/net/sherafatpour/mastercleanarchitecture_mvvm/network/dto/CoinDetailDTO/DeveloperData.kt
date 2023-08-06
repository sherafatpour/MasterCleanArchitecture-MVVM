package net.sherafatpour.mastercleanarchitecture_mvvm.network.dto.CoinDetailDTO


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class DeveloperData(
    @SerializedName("closed_issues")
    val closedIssues: Int?, // 7183
    @SerializedName("code_additions_deletions_4_weeks")
    val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks?,
    @SerializedName("commit_count_4_weeks")
    val commitCount4Weeks: Int?, // 207
    @SerializedName("forks")
    val forks: Int?, // 35484
    @SerializedName("last_4_weeks_commit_activity_series")
    val last4WeeksCommitActivitySeries: List<Int?>?,
    @SerializedName("pull_request_contributors")
    val pullRequestContributors: Int?, // 834
    @SerializedName("pull_requests_merged")
    val pullRequestsMerged: Int?, // 10856
    @SerializedName("stars")
    val stars: Int?, // 70638
    @SerializedName("subscribers")
    val subscribers: Int?, // 3942
    @SerializedName("total_issues")
    val totalIssues: Int? // 7536
)