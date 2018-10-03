package com.grefoxacademy.p2pchat.services;

import com.grefoxacademy.p2pchat.models.Messages;
import com.grefoxacademy.p2pchat.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
  private MessageRepository messageRepository;
  private UserService userService;

  @Autowired
  public MessageServiceImpl(MessageRepository messageRepository, UserService userService) {
    this.messageRepository = messageRepository;
    this.userService = userService;
  }

  @Override
  public List<Messages> getMessageList() {
    return messageRepository.findAll();
  }

  @Override
  public void createNewMessage(String text) {
    Messages message = new Messages(userService.getLoggedInUserName(), text);
    messageRepository.save(message);
  }
}
