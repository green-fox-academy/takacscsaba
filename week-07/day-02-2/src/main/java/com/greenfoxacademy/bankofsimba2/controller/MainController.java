package com.greenfoxacademy.bankofsimba2.controller;

import com.greenfoxacademy.bankofsimba2.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private BankAccount bankAccountCreater() {
    BankAccount bankAccount = new BankAccount("Simba", 2000.0, "lion");
    return bankAccount;
  }

  @GetMapping("")
  public String showingAccount(Model model) {
    model.addAttribute("bankAccount", bankAccountCreater());
    return "showaccounts";
  }

  @GetMapping("/html")
  public String htmlText(Model model) {
    model.addAttribute("html", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmltext";
  }
}
