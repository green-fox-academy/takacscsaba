package com.grefoxacademy.p2pchat.controllers;

import com.grefoxacademy.p2pchat.services.MessageService;
import com.grefoxacademy.p2pchat.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestMainController {
  private UserService userService;
  private MessageService messageService;

  public RestMainController(UserService userService, MessageService messageService) {
    this.userService = userService;
    this.messageService = messageService;
  }

  @PostMapping("/api/message/receive")
}
