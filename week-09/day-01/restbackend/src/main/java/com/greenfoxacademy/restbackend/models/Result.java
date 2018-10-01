package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class Result {
  private int result;
  private int[] resultArray;

  public Result(int result) {
    this.result = result;
  }

  public Result(int[] resultArray) {
    this.resultArray = resultArray;
  }

  public Result() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int[] getResultArray() {
    return resultArray;
  }

  public void setResultArray(int[] resultArray) {
    this.resultArray = resultArray;
  }
}
