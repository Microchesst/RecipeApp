package com.example.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.recipeapp.model.Recipe
import com.example.recipeapp.repository.RecipeRepository

class RecipeViewModel : ViewModel() {
    private val repository = RecipeRepository()

    fun getRecipes(): List<Recipe> {
        return repository.getRecipes()
    }

    fun getRecipeById(id: Int): Recipe? {
        return repository.getRecipeById(id)
    }
}