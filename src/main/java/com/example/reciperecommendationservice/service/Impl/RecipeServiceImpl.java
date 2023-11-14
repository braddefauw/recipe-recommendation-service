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
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        return recipe;
    }

    @Override
    public Recipe createRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
        return recipe;
    }

    @Override
    public Recipe updateRecipe(Long id, Recipe updatedRecipe) {
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        if (recipe != null) {
            recipe.setName(updatedRecipe.getName());
            recipe.setDescription(updatedRecipe.getDescription());
            recipeRepository.save(recipe);
        }
        return recipe;
    }

    @Override
    public Recipe deleteRecipe(Long id) {
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        if (recipe != null) {
            recipeRepository.delete(recipe);
        }
        return recipe;
    }
}
