package com.greenfoxacademy.pokemon.repositories;

import com.greenfoxacademy.pokemon.models.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}
