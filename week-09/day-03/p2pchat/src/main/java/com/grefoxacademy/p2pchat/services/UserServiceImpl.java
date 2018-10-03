package com.grefoxacademy.p2pchat.services;

import com.grefoxacademy.p2pchat.models.User;
import com.grefoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public boolean isUserWithSameNameExists(User user) {
    if (userRepository.findByName(user.getName()) == null) {
      return false;
    }
    return true;
  }

  @Override
  public void saveNewUser(User user) {
    userRepository.save(user);
  }

  @Override
  public List<User> findAllUser() {
    return userRepository.findAll();
  }

  @Override
  public User getFirstUser() {
    return userRepository.findFirstById(1L);
  }

  @Override
  public void usernameChanger(String username) {
    getFirstUser().setName(username);
    userRepository.save(getFirstUser());
  }
}
