package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.AppendA;
import com.greenfoxacademy.restbackend.models.Doubled;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
import com.greenfoxacademy.restbackend.models.WelcomeMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

  @GetMapping("/doubling")
  public Object makingDouble(@RequestParam(value = "input", required = false) Integer received) {
    if (received != null) {
      return new Doubled(received);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return new WelcomeMessage(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public AppendA appendAFunction(@PathVariable(value = "appendable") String appendable) {
    return new AppendA(appendable);
  }
}
