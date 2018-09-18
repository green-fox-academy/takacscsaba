package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
  String name;
  String balance;
  String animalType;
  Long id;

  public BankAccount() {
    this(null, null, null);
  }

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance + ".00 Zebra";
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
