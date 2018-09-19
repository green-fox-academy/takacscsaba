package com.greenfoxacademy.dependencytraining;

import com.greenfoxacademy.dependencytraining.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencytrainingApplication implements CommandLineRunner {

  @Autowired
  Printer printer;

  public DependencytrainingApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencytrainingApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }
}
