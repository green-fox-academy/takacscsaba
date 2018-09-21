package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
  private FoxService foxService;

  public LoginController(FoxService foxService) {
    this.foxService = foxService;
  }

  @RequestMapping("/login")
  public String nutritionDefault() {
    return "login";
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    model.addAttribute("fox", foxService.createFoxByName("deafult"));
    return "login";
  }

  @PostMapping("/login")
  public String createFoxFromName(@ModelAttribute(value = "name") String foxName, Model model) {
    foxService.createFoxByName(foxName);
//    foxService.getFoxByName(foxName);

    model.addAttribute("fox", foxService.getFoxByName(foxName));
    return "redirect:/?name=" + foxName;
  }
}
