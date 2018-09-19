package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
  BankServiceImpl bankServiceImpl;

  @Autowired
  public MainController(BankServiceImpl bankServiceImpl) {
    this.bankServiceImpl = bankServiceImpl;
  }

  @GetMapping("")
  public String showingAccount(Model model) {

//    List<BankAccount> bankAccounts = bankServiceImpl.getBankAccounts();
//    model.addAttribute("bankAccounts", bankAccounts);
    return "show";
  }

}
