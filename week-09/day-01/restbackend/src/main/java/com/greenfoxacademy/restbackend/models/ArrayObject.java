package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class ArrayObject {
  private String what;
  private int[] numbers;

  public ArrayObject(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArrayObject() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
