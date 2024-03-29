package com.tts.RecipeApp.repositories;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tts.RecipeApp.domains.UnitOfMeasure;
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTestIT {

	@Autowired
	UnitOfMeasureRepository unitOfMeasureRepository;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	//@DirtiesContext - spring context will start twice
	public void testFindByDescription() 
	{
		Optional<UnitOfMeasure> uomOptional  = unitOfMeasureRepository.findByDescription("Teaspoon");
		assertEquals("Teaspoon",uomOptional.get().getDescription());
	}
	@Test
	public void testFindByDescriptionCup() 
	{
		Optional<UnitOfMeasure> uomOptional  = unitOfMeasureRepository.findByDescription("Cup");
		assertEquals("Cup",uomOptional.get().getDescription());
	}


}
