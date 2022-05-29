package com.cocktails.cocktailsdb.data

import com.cocktails.cocktailsdb.BuildConfig
import com.cocktails.cocktailsdb.data.dto.CocktailsDto
import com.cocktails.cocktailsdb.domain.model.Cocktails
import retrofit2.Response
import retrofit2.http.GET


interface CocktailsApi {

    @retrofit2.http.Headers(
        "X-RapidAPI-Host: ${BuildConfig.HOST}",
        "X-RapidAPI-Key: ${BuildConfig.KEY}")
    @GET("popular.php")
    suspend fun getPopularCocktails() : List<CocktailsDto>

    @retrofit2.http.Headers(
        "X-RapidAPI-Host: the-cocktail-db.p.rapidapi.com",
        "X-RapidAPI-Key: a2c0abffe9msh5f9773dc66a9ad8p14922cjsnc0a04fc6180e")
    @GET("popular.php")
    suspend fun getLatestCocktails() : List<CocktailsDto>
}