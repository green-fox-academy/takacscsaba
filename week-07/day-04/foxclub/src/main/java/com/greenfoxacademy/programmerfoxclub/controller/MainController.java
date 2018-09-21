package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private FoxService foxService;

  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String showIndex(@RequestParam(required = false, value = "name") String foxName, Model model) {
//    List<String> tricks = new ArrayList<>();
//    tricks.add("Knows Java");
//    tricks.add("Knows Python");
//    foxService.createFoxByName("Róka Uraság");
//    foxService.createFox("Róka Úr", tricks, "pizza", "coke");
//    model.addAttribute("fox", foxService.getFoxList().get(0));
    if (foxName == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxService.getFoxByName(foxName));
      return "index";
    }
  }
}
