package com.greenfoxacademy.bankofsimba2.controller;

import com.greenfoxacademy.bankofsimba2.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

  private BankAccount bankAccountCreater() {
    BankAccount bankAccount = new BankAccount("Simba", 2000.0, "lion");
    return bankAccount;
  }

  @GetMapping("")
  public String showingAccount(Model model) {
    model.addAttribute("bankAccount", bankAccountCreater());
    return "show";
  }

}
