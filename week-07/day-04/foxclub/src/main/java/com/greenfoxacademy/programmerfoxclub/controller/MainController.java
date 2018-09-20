package com.greenfoxacademy.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("")
  public String showIndex(Model model) {
    return "index";
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    return "login";
  }

  @PostMapping("/add")
  public String addName(@RequestParam(value = "name") String name) {
    return "index";
  }

}
