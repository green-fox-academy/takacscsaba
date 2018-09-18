package com.greenfoxacademy.bankofsimba2.services;

import com.greenfoxacademy.bankofsimba2.models.Animal;
import com.greenfoxacademy.bankofsimba2.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankServiceInt {
  BankAccount createBankAccount(String name);
  List<BankAccount> getBankAccounts();
  BankAccount getBankAccountById(Long id);
  BankAccount addAnimal(Long bankAccountId, Animal newAnimal);
}
