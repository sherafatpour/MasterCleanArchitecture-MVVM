package net.sherafatpour.mastercleanarchitecture_mvvm.di

import android.provider.SyncStateContract.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.sherafatpour.mastercleanarchitecture_mvvm.data.CoinGeckoApi
import net.sherafatpour.mastercleanarchitecture_mvvm.data.repository.CoinRepositoryImpl
import net.sherafatpour.mastercleanarchitecture_mvvm.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoinGeckoModule {


    @Provides
    @Singleton
    fun provideCoinGeckoApi():CoinGeckoApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CoinGeckoApi::class.java)


    @Provides
    @Singleton
    fun provideCoinGeckoRepository(api: CoinGeckoApi)= CoinRepositoryImpl(api)

}