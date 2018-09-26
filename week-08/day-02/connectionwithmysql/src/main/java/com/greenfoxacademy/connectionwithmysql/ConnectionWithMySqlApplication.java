package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySqlApplication implements CommandLineRunner {
  private final TodoRepository todoRepository;

  @Autowired
  public ConnectionWithMySqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMySqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Feed the cats", false, false));
    todoRepository.save(new Todo("Feed Csabi", true, false));
    todoRepository.save(new Todo("Feed Edo", true, true));
    todoRepository.save(new Todo("Feed everybody else"));
  }
}
