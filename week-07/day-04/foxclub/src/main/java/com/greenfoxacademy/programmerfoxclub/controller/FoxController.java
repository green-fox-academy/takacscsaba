package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  private FoxService foxService;

  public FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @PostMapping("/nutritionStore")
  public String nutritionUpdate(@RequestParam(required = false, value = "name") String foxName,
                                @RequestParam(required = false, value = "food") String food,
                                @RequestParam(required = false, value = "drink") String drink,
                                Model model) {
    foxService.getFoxByName(foxName).setFood(food);
    foxService.getFoxByName(foxName).setDrink(drink);
    model.addAttribute("fox", foxService.getFoxByName(foxName));

    return "redirect:/?name=" + foxName;
  }
}
