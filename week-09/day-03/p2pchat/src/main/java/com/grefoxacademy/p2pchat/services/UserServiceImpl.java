package com.grefoxacademy.p2pchat.services;

import com.grefoxacademy.p2pchat.models.User;
import com.grefoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  private UserRepository userRepository;
  private String loggedInUserName;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public String getLoggedInUserName() {
    return loggedInUserName;
  }

  @Override
  public void setLoggedInUserName(String loggedInUserName) {
    this.loggedInUserName = loggedInUserName;
  }

  @Override
  public boolean isUserWithSameNameExists(User user) {
    if (userRepository.findById(user.getId()) == null) {
      return false;
    }
    return true;
  }

  @Override
  public void saveNewUser(User user) {
    setLoggedInUserName(user.getId());
    userRepository.save(user);
  }

  @Override
  public List<User> findAllUser() {
    return userRepository.findAll();
  }

  @Override
  public User getLoggedInUser() {
    return userRepository.findById(loggedInUserName);
  }

  @Override
  public void usernameChanger(String newUsername) {
    userRepository.delete(getLoggedInUser());
    setLoggedInUserName(newUsername);
    userRepository.save(new User(newUsername));
  }
}
