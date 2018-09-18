package com.greenfoxacademy.bankofsimba2.repositories;

import com.greenfoxacademy.bankofsimba2.models.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
