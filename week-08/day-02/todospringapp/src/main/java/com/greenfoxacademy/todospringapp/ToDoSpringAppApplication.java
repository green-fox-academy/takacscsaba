package com.greenfoxacademy.todospringapp;

import com.greenfoxacademy.todospringapp.models.Todo;
import com.greenfoxacademy.todospringapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoSpringAppApplication implements CommandLineRunner {

  private final TodoRepository todoRepository;

  @Autowired
  public ToDoSpringAppApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ToDoSpringAppApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
  }
}
