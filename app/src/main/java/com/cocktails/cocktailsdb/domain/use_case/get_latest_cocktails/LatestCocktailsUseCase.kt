package com.cocktails.cocktailsdb.domain.use_case.get_latest_cocktails

import com.cocktails.cocktailsdb.common.Resource
import com.cocktails.cocktailsdb.data.dto.toDrink
import com.cocktails.cocktailsdb.domain.model.Cocktails
import com.cocktails.cocktailsdb.domain.repository.ListRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class LatestCocktailsUseCase @Inject constructor(
    private val repository: ListRepository
) {
    operator fun invoke(): Flow<Resource<List<Cocktails>>> = flow {
        try {
            emit(Resource.Loading())
            val popularCocktails = repository.getLatestCocktails().map {
                it.drinks.map {

                    it.toDrink()
                }
            }
            emit(Resource.Success(popularCocktails))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))

        } catch (e: IOException) {
            emit(Resource.Error("Check internet connection"))
        }
    }
}