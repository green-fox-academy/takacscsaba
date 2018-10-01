package com.greenfoxacademy.restbackend.models;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class LogObject {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String endpoint;
  private String data;
  @CreationTimestamp
  private Date createdAt;

  public LogObject() {
  }

  public LogObject(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }
}
