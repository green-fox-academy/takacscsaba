package com.grefoxacademy.p2pchat.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  private String id;

  public User() {
  }

  public User(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
