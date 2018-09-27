package com.greenfoxacademy.pokemon.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long pid;
  @Length(max = 20)
  private String tname;
  @Length(max = 255)
  private String picture;
  @Length(max = 40)
  private String type1;
  @Length(max = 40)
  private String type2;

  public Pokemon(Long pid, @Length(max = 20) String tname, @Length(max = 255) String picture, @Length(max = 40) String type1, @Length(max = 40) String type2) {
    this.pid = pid;
    this.tname = tname;
    this.picture = picture;
    this.type1 = type1;
    this.type2 = type2;
  }

  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }

  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getType1() {
    return type1;
  }

  public void setType1(String type1) {
    this.type1 = type1;
  }

  public String getType2() {
    return type2;
  }

  public void setType2(String type2) {
    this.type2 = type2;
  }
}
