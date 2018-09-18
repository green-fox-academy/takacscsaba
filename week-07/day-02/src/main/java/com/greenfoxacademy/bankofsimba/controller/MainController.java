package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/show")
  public String showingAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "show";
  }

}
