package com.cocktails.cocktailsdb.domain.repository

import com.cocktails.cocktailsdb.data.dto.CocktailsDto
import com.cocktails.cocktailsdb.domain.model.Cocktails
import retrofit2.Response

interface ListRepository {

    suspend fun getPopularCocktails(): List<CocktailsDto>

    suspend fun getLatestCocktails(): List<CocktailsDto>

    suspend fun getDrinkCategories()

    suspend fun getAlcoholicFilters()

}