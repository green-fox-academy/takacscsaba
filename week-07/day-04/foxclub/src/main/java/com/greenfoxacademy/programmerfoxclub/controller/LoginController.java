package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
  private FoxService foxService;

  public LoginController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String createFoxFromName(@RequestParam(value = "name") String foxName, Model model) {
    model.addAttribute("foxName", foxName);
    foxService.createFoxByName(foxName);
    return "redirect:/";
  }
}
