package com.grefoxacademy.p2pchat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String indexPage() {
    return "index";
  }

  @GetMapping("/register")
  public String registerPage(@ModelAttribute String warning, Model model) {
    return "register";
  }

  @PostMapping("/register")
  public String registerNewUser() {
    
  }
}
