package com.greenfoxacademy.restbackend.repositories;

import com.greenfoxacademy.restbackend.models.LogObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<LogObject, Long> {
  List<LogObject> findAll();
}
