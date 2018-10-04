package com.greenfoxacademy.bankofsimbawithdb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Integer balance;
  private String animalType;
  private boolean isGood;
  private boolean isKing;

  public BankAccount() {
  }

  public BankAccount(String name, Integer balance, String animalType, boolean isGood, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isGood = isGood;
    this.isKing = isKing;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }
}
