package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {
  Fox createFox(String name, List<String> tricks, String food, String drink);
  Fox createFoxByName(String name);
  List<Fox> getFoxList();
  List<Fox> addFox(Fox fox);
  Fox getFoxByName(String name);
}
