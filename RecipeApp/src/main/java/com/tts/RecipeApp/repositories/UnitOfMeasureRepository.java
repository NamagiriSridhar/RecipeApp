package com.tts.RecipeApp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tts.RecipeApp.domains.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>
{
	Optional<UnitOfMeasure> findByDescription(String description);

}
