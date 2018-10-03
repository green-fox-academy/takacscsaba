package com.grefoxacademy.p2pchat.controllers;

import com.grefoxacademy.p2pchat.models.User;
import com.grefoxacademy.p2pchat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private UserService userService;

  @Autowired
  public MainController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    if (userService.findAllUser().isEmpty()) {
      return "redirect:/register";
    } else {
      model.addAttribute("user", userService.getFirstUser());
      return "index";
    }
  }

  @PostMapping("/")
  public String updateUsername(@RequestParam(value = "username") String username) {
    userService.usernameChanger(username);
    return "redirect:/";
  }

  @GetMapping("/register")
  public String registerPage(Model model) {
    model.addAttribute("user", new User());
    return "register";
  }

  @PostMapping("/register")
  public String registerNewUser(@ModelAttribute User user) {
    if (!userService.isUserWithSameNameExists(user)) {
      userService.saveNewUser(user);
      return "redirect:/";
    } else {
      return "redirect:/register";
    }
  }
}
