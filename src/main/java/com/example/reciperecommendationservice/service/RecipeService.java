package com.example.reciperecommendationservice.service;

import com.example.reciperecommendationservice.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAllRecipes();
    Recipe getRecipeById(Long id);
    Recipe createRecipe(Recipe recipe);
    Recipe updateRecipe(Long id, Recipe updatedRecipe);
    Recipe deleteRecipe(Long id);
}
