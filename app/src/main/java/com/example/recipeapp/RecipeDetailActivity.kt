package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.recipeapp.ui.RecipeDetailScreen
import com.example.recipeapp.ui.theme.RecipeAppTheme

class RecipeDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recipeId = intent.getIntExtra("recipeId", -1)
        setContent {
            RecipeAppTheme {
                RecipeDetailScreen(
                    recipeId = recipeId,
                    onNavigateUp = { finish() }
                )
            }
        }
    }
}