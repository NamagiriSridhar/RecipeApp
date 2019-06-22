package com.tts.RecipeApp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tts.RecipeApp.domains.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> 
{
	Optional<Category> findByDescription(String description);
	
}
