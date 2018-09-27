package com.greenfoxacademy.pokemon.repositories;

import com.greenfoxacademy.pokemon.models.Trainer;
import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer, Long> {
}
