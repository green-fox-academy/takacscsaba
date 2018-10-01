package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class Result {
  private int result;

  public Result(int result) {
    this.result = result;
  }

  public Result() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
