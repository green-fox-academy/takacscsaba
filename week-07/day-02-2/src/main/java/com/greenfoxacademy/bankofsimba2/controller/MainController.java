package com.greenfoxacademy.bankofsimba2.controller;

import com.greenfoxacademy.bankofsimba2.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  private List<BankAccount> bankAccountCreater() {
    List<BankAccount> bankAccounts = new ArrayList<>();
    BankAccount simbaAccount = new BankAccount("Simba", 2500.0, "lion", true, true);
    bankAccounts.add(simbaAccount);
    BankAccount mufasaAccount = new BankAccount("Mufasa", 5000.0, "lion", true, true);
    bankAccounts.add(mufasaAccount);
    BankAccount rafikiAccount = new BankAccount("Rafiki", 500.0, "pavian", false, true);
    bankAccounts.add(rafikiAccount);
    BankAccount kiraAccount = new BankAccount("Kira", 1000.0, "lion", false, true);
    bankAccounts.add(kiraAccount);
    BankAccount pumbaAccount = new BankAccount("Pumba", 1500.0, "vaddiszno", false, true);
    bankAccounts.add(pumbaAccount);
    BankAccount zordonAccount = new BankAccount("Zordon", 150.0, "lion", true, false);
    bankAccounts.add(zordonAccount);

    return bankAccounts;
  }

  @GetMapping("")
  public String showingAccount(Model model) {
    model.addAttribute("bankAccounts", bankAccountCreater());
    return "showaccounts";
  }

  @GetMapping("/html")
  public String htmlText(Model model) {
    model.addAttribute("html", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmltext";
  }

  @PostMapping("")
  public String donatingZebras(@ModelAttribute(value = "name") String name, @ModelAttribute(value = "zebraNumber") double donation) {
    for (int i = 0; i < bankAccountCreater().size(); i++) {
      if (bankAccountCreater().get(i).getName().equals(name))
        bankAccountCreater().get(i).setBalance(bankAccountCreater().get(i).getBalance() + donation);
    }
    return "showaccounts";
  }
}
