package com.example.recipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.recipeapp.ui.RecipeListScreen
import com.example.recipeapp.ui.theme.RecipeAppTheme

class RecipeListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeAppTheme {
                RecipeListScreen(
                    onRecipeClick = { recipeId ->
                        val intent = Intent(this, RecipeDetailActivity::class.java).apply {
                            putExtra("recipeId", recipeId)
                        }
                        startActivity(intent)
                    },
                    onNavigateUp = { finish() }
                )
            }
        }
    }
}