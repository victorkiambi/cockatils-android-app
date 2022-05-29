package com.cocktails.cocktailsdb.di

import com.cocktails.cocktailsdb.data.CocktailsApi
import com.cocktails.cocktailsdb.data.repository.ListRepositoryImpl
import com.cocktails.cocktailsdb.domain.repository.ListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideCocktailsApi(): CocktailsApi {
        val baseUrl = "https://the-cocktail-db.p.rapidapi.com/"

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CocktailsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideListRepository(api: CocktailsApi): ListRepository {
        return ListRepositoryImpl(api)
    }
}