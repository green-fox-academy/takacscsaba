package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
