package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  private PostService postService;

  public MainController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String getIndexPage(Model model) {
    model.addAttribute("postList", postService.getPostList());
    return "index";
  }

  @GetMapping("/submit")
  public String getSubmitPage(Model model) {
    return "submit";
  }

  @GetMapping("/countInc/{id}")
  public String increasePostCount(@PathVariable(value = "id") Long id) {
    postService.countIncreaser(id);
    return "redirect:/";
  }

  @GetMapping("/countDec/{id}")
  public String decreasePostCount(@PathVariable(value = "id") Long id) {
    postService.countDecreaser(id);
    return "redirect:/";
  }
}
