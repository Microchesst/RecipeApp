package com.example.recipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.recipeapp.ui.MainScreen
import com.example.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(
                        onNavigateToList = {
                            val intent = Intent(this@MainActivity, RecipeListActivity::class.java)
                            startActivity(intent)
                        },
                        onNavigateToDetail = { recipeId ->
                            val intent = Intent(this@MainActivity, RecipeDetailActivity::class.java).apply {
                                putExtra("recipeId", recipeId)
                            }
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}