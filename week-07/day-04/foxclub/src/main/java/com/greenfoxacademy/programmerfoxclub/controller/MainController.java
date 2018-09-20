package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  Fox fox;

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("foxName", fox.getName());
    return "index";
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    return "login";
  }

  @PostMapping("/login")
  public String getFox(@RequestParam(value = "name") String foxname, Model model) {
    model.addAttribute("foxName", foxname);
    return "redirect:/";
  }

}
