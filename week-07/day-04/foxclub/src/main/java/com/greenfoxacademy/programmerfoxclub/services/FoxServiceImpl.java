package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {
  Fox fox;
  List<Fox> foxList = new ArrayList<>();

  @Override
  public Fox createFox(String name, List<String> tricks, String food, String drink) {
    fox = new Fox(name, tricks, food, drink);
    foxList.add(fox);
    return new Fox(name);
  }

  @Override
  public Fox createFoxByName(String name) {
    fox = new Fox(name);
    fox.setTricks(new ArrayList<>());
    foxList.add(fox);
    return new Fox(name);
  }

  @Override
  public List<Fox> getFoxList() {
    return foxList;
  }

  @Override
  public List<Fox> addFox(Fox fox) {
    foxList.add(fox);
    return foxList;
  }

  @Override
  public Fox getFoxByName(String name) {
    for (int i = 0; i < getFoxList().size(); i++) {
        if (getFoxList().get(i).getName().equals(name)) {
          return getFoxList().get(i);
        }
      }
    return null;
  }
}
