package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  long id;
  String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return "Hello, " + content;
  }

  @Override
  public String toString() {
    return "{" +
        "id:" + this.getId() +
        ", content:'" + this.getContent() + '\'' +
        '}';
  }
}
