package com.tts.RecipeApp.services;

import java.util.Set;

import com.tts.RecipeApp.domains.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
