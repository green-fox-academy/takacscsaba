package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestMainController {
  MainService mainService;

  @Autowired
  public RestMainController(MainService mainService) {
    this.mainService = mainService;
  }


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

  @PostMapping("/dountil/{action}")
  public Object untilTimer(@PathVariable(value = "action", required = false) String action, @RequestBody(required = false) DoUntil doUntil) {
    if (action.equals("sum")) {
      mainService.sumNumber(doUntil);
      return mainService.getResult();
    } else if (action.equals("factor")) {
      mainService.factorNumber(doUntil);
      return mainService.getResult();
    }
    if (doUntil == null) {
      return new ErrorMessage("Please provide an number!");
    } else {
      return null;
    }
  }
}
