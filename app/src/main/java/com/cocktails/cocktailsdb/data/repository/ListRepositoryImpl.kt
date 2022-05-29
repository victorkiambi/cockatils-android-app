package com.cocktails.cocktailsdb.data.repository

import com.cocktails.cocktailsdb.data.CocktailsApi
import com.cocktails.cocktailsdb.data.dto.CocktailsDto
import com.cocktails.cocktailsdb.domain.repository.ListRepository
import retrofit2.Response
import javax.inject.Inject

class ListRepositoryImpl @Inject constructor(
    private  val api: CocktailsApi
) : ListRepository {

    override suspend fun getPopularCocktails(): Response<CocktailsDto> {
        return api.getPopularCocktails()
    }

    override suspend fun getLatestCocktails(): Response<CocktailsDto> {
        return api.getLatestCocktails()
    }

    override suspend fun getDrinkCategories() {
        TODO("Not yet implemented")
    }

    override suspend fun getAlcoholicFilters() {
        TODO("Not yet implemented")
    }
}