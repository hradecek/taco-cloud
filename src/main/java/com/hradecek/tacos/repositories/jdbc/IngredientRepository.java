package com.hradecek.tacos.repositories.jdbc;

import com.hradecek.tacos.models.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
