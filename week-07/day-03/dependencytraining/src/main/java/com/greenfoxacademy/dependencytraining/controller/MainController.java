package com.greenfoxacademy.dependencytraining.controller;

import com.greenfoxacademy.dependencytraining.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @Autowired
  UtilityService utilityService;

  public MainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("")
  public String index() {
    return "index";
  }

  @GetMapping("/useful")
  public String useful(Model model) {
    model.addAttribute("colors", utilityService.getColors());
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String usefulColors(Model model) {
    model.addAttribute("colors", utilityService.randomColor());
    return "colored";
  }
}
