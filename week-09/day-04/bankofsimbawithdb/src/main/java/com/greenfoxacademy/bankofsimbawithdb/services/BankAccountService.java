package com.greenfoxacademy.bankofsimbawithdb.services;

import com.greenfoxacademy.bankofsimbawithdb.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankAccountService {
  List<BankAccount> getAllAccount();

  BankAccount getAccountById(Long id);

  void raiseAccountBalance(Long id);
}
