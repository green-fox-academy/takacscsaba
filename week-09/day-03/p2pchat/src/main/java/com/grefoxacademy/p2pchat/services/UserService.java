package com.grefoxacademy.p2pchat.services;

import com.grefoxacademy.p2pchat.models.Messages;
import com.grefoxacademy.p2pchat.models.User;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
  boolean isUserWithSameNameExists(User user);

  void saveNewUser(User user);

  List<User> findAllUser();

  User getLoggedInUser();

  void usernameChanger(String newUsername);

  void setLoggedInUserName(String loggedInUserName);

  String getLoggedInUserName();
}
