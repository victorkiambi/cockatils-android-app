package com.cocktails.cocktailsdb.data.dto

import com.cocktails.cocktailsdb.domain.model.Drink

data class DrinkDto (
    val idDrink: String,
    val strDrink: String,
    val strTags: String,
    val strCategory: String,
    val strIBA: String,
    val strAlcoholic: String,
    val strGlass: String,
    val strInstructions: String,
    val strDrinkThumb: String,
    val strIngredient1: String,
    val strIngredient2: String,
    val strIngredient3: String,
    val strIngredient4: String,
    val strIngredient5: String,
    val strMeasure1: String,
    val strMeasure2: String,
    val strMeasure3: String,
    val strMeasure4: String,
    val strImageSource: String,
    val strImageAttribution: String,
    val strCreativeCommonsConfirmed: String,
    val dateModified: String
)

fun DrinkDto.toDrink(): Drink{
    return Drink(
        idDrink = idDrink,
        strDrink = strDrink,
        strTags = strTags,
        strCategory = strCategory,
        strAlcoholic = strAlcoholic,
        strIBA = strIBA,
        strGlass = strGlass,
        strInstructions = strInstructions,
        strDrinkThumb = strDrinkThumb,
        strIngredient1 = strIngredient1,
        strIngredient2 = strIngredient2,
        strIngredient3 = strIngredient3,
        strIngredient4 = strIngredient4,
        strIngredient5 = strIngredient5,
        strImageSource = strImageSource,
        strImageAttribution = strImageAttribution
    )
}
