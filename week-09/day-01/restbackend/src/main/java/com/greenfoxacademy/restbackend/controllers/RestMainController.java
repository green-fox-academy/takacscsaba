package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.services.MainService;
import com.greenfoxacademy.restbackend.services.MainServiceImpl;
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
    Result result = new Result();
    MainService mainService = new MainServiceImpl(result);

    if (doUntil != null) {
      if (action.equals("sum")) {
        return mainService.sumNumber(doUntil);
      }
      if (action.equals("factor")) {
        return mainService.factorNumber(doUntil);
      }
    }
    return new ErrorMessage("Please provide a number!");
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody(required = false) ArrayObject arrayObject) {
    Result result = new Result();
    MainService mainService = new MainServiceImpl(result);

    if (arrayObject.getWhat() != null) {
      if (arrayObject.getWhat().equals("sum")) {
        return mainService.sumArray(arrayObject);
      }
      if (arrayObject.getWhat().equals("multiply")) {
        return mainService.multiplyArray(arrayObject);
      }
      if (arrayObject.getWhat().equals("double")) {
        return mainService.doubleArray(arrayObject);
      }
    }
    return new ErrorMessage("Please provide what to do with the numbers!");
  }
}
