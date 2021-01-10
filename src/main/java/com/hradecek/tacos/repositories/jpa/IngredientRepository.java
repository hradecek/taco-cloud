package com.hradecek.tacos.repositories.jpa;

import com.hradecek.tacos.models.Ingredient;

import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> { }
