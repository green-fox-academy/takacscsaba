package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {
  public String getName() {
    return name;
  }

  public String getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  String name;
  String balance;
  String animalType;

  public BankAccount() {
  }

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
}
