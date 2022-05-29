package com.cocktails.cocktailsdb

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cocktails.cocktailsdb.data.CocktailsApi
import com.cocktails.cocktailsdb.presentation.ui.theme.CocktailsDBTheme
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CocktailsDBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Button(onClick = { getList() }) {
                        Text(text = "Click me")
                    }
                }
            }
        }
    }
}

@OptIn(DelicateCoroutinesApi::class)
fun getList(){
    Log.d("Tag", "clicked")

//    val quotesApi = RetrofitHelper.getInstance().create(CocktailsApi::class.java)
//    // launching a new coroutine
//    GlobalScope.launch {
//        val result = quotesApi.getPopularCocktails()
//        Log.d("repoStuff: ", result.body().toString())
//    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CocktailsDBTheme {
        Greeting("Android")
    }
}