package com.greenfoxacademy.restbackend.models;

public class AppendA {
  String appended;


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
