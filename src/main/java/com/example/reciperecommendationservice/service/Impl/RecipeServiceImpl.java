package com.example.reciperecommendationservice.service.Impl;

import com.example.reciperecommendationservice.model.Recipe;
import com.example.reciperecommendationservice.repository.RecipeRepository;
import com.example.reciperecommendationservice.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return recipes;
    }

    @Override
    public Recipe getRecipeById(Long id) {
        return null;
    }

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe updateRecipe(Long id, Recipe updatedRecipe) {
        return null;
    }

    @Override
    public Recipe deleteRecipe(Long id) {
        return null;
    }
}
