package net.sherafatpour.mastercleanarchitecture_mvvm.domain.useCases

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.sherafatpour.mastercleanarchitecture_mvvm.domain.model.Coin
import net.sherafatpour.mastercleanarchitecture_mvvm.domain.repository.CoinRepository
import net.sherafatpour.mastercleanarchitecture_mvvm.utils.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinListUseCase @Inject constructor(private val repository: CoinRepository) {


    operator fun invoke():Flow<Resource<List<Coin>>> = flow{

        try {
            emit(Resource.Loading())
            val coins = repository.getAllCoins().map {
                it.toCoin()

            }

            emit(Resource.Success(coins))


        }catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage))

        }
        catch (e:IOException){
            emit(Resource.Error(e.localizedMessage))

        }



    }
}