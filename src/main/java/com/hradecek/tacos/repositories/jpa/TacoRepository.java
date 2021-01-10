package com.hradecek.tacos.repositories.jpa;

import com.hradecek.tacos.models.Taco;

import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> { }
