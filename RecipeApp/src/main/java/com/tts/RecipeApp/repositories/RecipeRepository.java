package com.tts.RecipeApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tts.RecipeApp.domains.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long>{

}
