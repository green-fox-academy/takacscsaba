package com.greenfoxacademy.dependencytraining;

import com.greenfoxacademy.dependencytraining.services.MyColor;
import com.greenfoxacademy.dependencytraining.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencytrainingApplication implements CommandLineRunner {

  @Autowired
  Printer printer;
  MyColor myColor;

  public DependencytrainingApplication(Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencytrainingApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }
}
