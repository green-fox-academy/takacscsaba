package com.grefoxacademy.p2pchat.services;

import com.grefoxacademy.p2pchat.models.Messages;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
  List<Messages> getMessageList();

  void createNewMessage(String text);
}
