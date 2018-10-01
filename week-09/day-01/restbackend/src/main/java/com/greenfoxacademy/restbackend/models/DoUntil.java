package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class DoUntil {
  private Integer until;

  public DoUntil(Integer until) {
    this.until = until;
  }

  public DoUntil() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
}
