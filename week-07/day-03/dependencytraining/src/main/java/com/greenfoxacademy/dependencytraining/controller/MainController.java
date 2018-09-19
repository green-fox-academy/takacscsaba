package com.greenfoxacademy.dependencytraining.controller;

import com.greenfoxacademy.dependencytraining.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  public static final String validEmailformat = "ize@bize.com";
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


  @GetMapping("/useful/email")
  public String showValidEmail(@RequestParam("email") String emailAddress, Model model) {
    model.addAttribute("email", emailAddress);
    model.addAttribute("valid", utilityService.validateEmail(emailAddress));
    return "email";
  }

}
