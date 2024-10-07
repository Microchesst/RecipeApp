package com.example.recipeapp.repository

import com.example.recipeapp.model.Recipe

class RecipeRepository {
    fun getRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                id = 1,
                name = "Spaghetti Carbonara",
                description = "Italians and everybody else loves it!",
                ingredients = listOf("Spaghetti", "Eggs", "Pecorino Romano", "Guanciale", "Black pepper"),
                instructions = listOf(
                    "Cook spaghetti in salted water",
                    "Fry guanciale until crispy",
                    "Mix eggs and cheese",
                    "Combine all ingredients"
                ),
                prepTime = 10,
                cookTime = 15,
                servings = 4,
                imageUrl = "https://www.valdemarsro.dk/wp-content/2016/10/carbonara_app-1300.jpg"
            ),
            Recipe(
                id = 2,
                name = "Chicken Stir-Fry",
                description = "Fryyyyyy Riiiice",
                ingredients = listOf("Chicken breast", "Mixed vegetables", "Soy sauce", "Ginger", "Garlic"),
                instructions = listOf(
                    "Cut chicken into bite-sized pieces",
                    "Stir-fry chicken until golden",
                    "Add vegetables and stir-fry",
                    "Season with soy sauce, ginger, and garlic"
                ),
                prepTime = 15,
                cookTime = 10,
                servings = 2,
                imageUrl = "https://www.saltandlavender.com/wp-content/uploads/2022/03/chicken-stir-fry-1.jpg"
            ),
            Recipe(
                id = 3,
                name = "Scorepasta",
                description = "Cook to impress 'The Man Of Your Life!'",
                ingredients = listOf(
                    "600-800g ripe, flavorful tomatoes",
                    "80-100g butter",
                    "20 sage leaves",
                    "1-2 tsp apple cider vinegar",
                    "1-2 tsp honey or light syrup",
                    "Salt and pepper",
                    "400-500g pasta",
                    "2-4 burrata cheeses",
                    "Parmesan cheese"
                ),
                instructions = listOf(
                    "Bring pasta water to a boil. Take burrata out of the fridge to reach room temperature.",
                    "Cut tomatoes into small pieces. Start cooking the pasta.",
                    "Slowly heat butter in a small pan over medium heat. When it turns golden brown and smells like caramel, lower the heat.",
                    "Add sage leaves to the butter and cook briefly. Remove leaves and place on paper towel to crisp.",
                    "Add tomatoes to the butter. Increase heat and cook for about 5 minutes.",
                    "Season with vinegar, honey, salt, and pepper.",
                    "When pasta is al dente, mix it with the sauce.",
                    "Tear burrata in half and place on top of the pasta. Drizzle with olive oil, salt, and freshly ground pepper.",
                    "Garnish with crispy sage leaves and serve with plenty of finely grated Parmesan and freshly ground pepper."
                ),
                prepTime = 5,
                cookTime = 10,
                servings = 4,
                imageUrl = "https://vegetariskhverdag.dk/wp-content/uploads/2022/09/scorepasta.jpg"
            ),

            )
    }

    fun getRecipeById(id: Int): Recipe? {
        return getRecipes().find { it.id == id }
    }
}