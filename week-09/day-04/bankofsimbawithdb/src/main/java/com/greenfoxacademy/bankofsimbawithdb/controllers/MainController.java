package com.greenfoxacademy.bankofsimbawithdb.controllers;

import com.greenfoxacademy.bankofsimbawithdb.services.BankAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private BankAccountService bankAccountService;

  public MainController(BankAccountService bankAccountService) {
    this.bankAccountService = bankAccountService;
  }

  @GetMapping("/")
  public String showIndexPage(Model model) {
    model.addAttribute("bankAccounts", bankAccountService.getAllAccount());
    return "index";
  }

  @PostMapping("/raisebalance")
  public String raiseBalance(@RequestParam Long id) {
    bankAccountService.raiseAccountBalance(id);
    return "redirect:/";
  }
}
