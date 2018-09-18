package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankServiceInt {
  BankAccount createBankAccount(String shelterName);
  List<BankAccount> getBankAccounts();
  BankAccount getBankAccountById(Long id);
  BankAccount addBankAccount(Long shelterId, BankAccount newBankAccount);
}
