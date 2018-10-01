package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class DoUntil {
  private int until;

  public DoUntil(int until) {
    this.until = until;
  }

  public DoUntil() {
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
