package com.greenfoxacademy.restbackend.models;

public class AppendA {
  private String appended;


  public AppendA(String appended) {
    this.appended = appended.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
