package net.sherafatpour.mastercleanarchitecture_mvvm.domain.useCases

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.sherafatpour.mastercleanarchitecture_mvvm.domain.model.Coin
import net.sherafatpour.mastercleanarchitecture_mvvm.domain.model.CoinDetail
import net.sherafatpour.mastercleanarchitecture_mvvm.domain.repository.CoinRepository
import net.sherafatpour.mastercleanarchitecture_mvvm.utils.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinDetailUseCase @Inject constructor(private val repository: CoinRepository) {


    operator fun invoke(id:String): Flow<Resource<CoinDetail>> = flow{

        try {
            emit(Resource.Loading())
            val coinDetail = repository.getCoinById(id).toCoinDetail()

            emit(Resource.Success(coinDetail))


        }catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage))

        }
        catch (e:IOException){
            emit(Resource.Error(e.localizedMessage))

        }



    }
}