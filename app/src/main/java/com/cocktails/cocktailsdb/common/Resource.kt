package com.cocktails.cocktailsdb.common

import com.cocktails.cocktailsdb.domain.model.Drink

sealed class Resource<T>(val data: Any? = null, val message: String? = null){
    class Success<T>(data: List<List<Drink>>): Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}
