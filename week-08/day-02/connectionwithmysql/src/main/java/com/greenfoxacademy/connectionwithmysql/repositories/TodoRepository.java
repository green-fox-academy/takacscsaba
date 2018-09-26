package com.greenfoxacademy.connectionwithmysql.repositories;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAll();
  List<Todo> findAllByDoneIsTrue();
  Todo findById(long id);
}
