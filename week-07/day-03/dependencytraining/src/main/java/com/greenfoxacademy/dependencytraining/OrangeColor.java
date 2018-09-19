package com.greenfoxacademy.dependencytraining;

import com.greenfoxacademy.dependencytraining.services.MyColor;
import org.springframework.stereotype.Service;

@Service
public class OrangeColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is orange in color...");
  }
}
