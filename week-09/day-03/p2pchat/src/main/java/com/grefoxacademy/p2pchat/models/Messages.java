package com.grefoxacademy.p2pchat.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Messages {
  @Id
  private Long id;
  private String username;
  private String text;
  @CreationTimestamp
  private Timestamp timestamp;

  public Messages() {
    this.id = generateMyNumber();
  }

  public Messages(String username, String text, Timestamp timestamp) {
    this.id = generateMyNumber();
    this.username = username;
    this.text = text;
    this.timestamp = timestamp;
  }

  public static Long generateMyNumber()
  {
    Long aNumber = 0L;
    aNumber = (long) ((Math.random() * 9000000)+1000000);
    return aNumber;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }
}
