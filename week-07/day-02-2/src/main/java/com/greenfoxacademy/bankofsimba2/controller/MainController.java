package com.greenfoxacademy.bankofsimba2.controller;

import com.greenfoxacademy.bankofsimba2.models.BankAccount;
import com.greenfoxacademy.bankofsimba2.services.BankServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

  @GetMapping("")
  public String showingAccount(Model model) {
    model.addAttribute();
    return "show";
  }

}
