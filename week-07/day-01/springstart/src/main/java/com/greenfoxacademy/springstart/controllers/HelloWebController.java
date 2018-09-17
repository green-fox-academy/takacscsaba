package com.greenfoxacademy.springstart.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWebController {

  @RequestMapping("/web/greeting")
  @ResponseBody
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }
}
