package com.greenfoxacademy.springstart.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class HelloRESTController {
  public final AtomicLong atomicLong = new AtomicLong(0);

  @RequestMapping("/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam(name = "name") String name) {
    Greeting greet = new Greeting(atomicLong.getAndIncrement(), name);
    return greet;
  }
}
