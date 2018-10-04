package com.greenfoxacademy.bankofsimbawithdb.services;

import com.greenfoxacademy.bankofsimbawithdb.models.BankAccount;
import com.greenfoxacademy.bankofsimbawithdb.repositories.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {
  private BankAccountRepository bankAccountRepository;

  public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
    this.bankAccountRepository = bankAccountRepository;
  }

  @Override
  public List<BankAccount> getAllAccount() {
    return bankAccountRepository.findAll();
  }

  @Override
  public BankAccount getAccountById(Long id) {
    return bankAccountRepository.findAllById(id);
  }

  @Override
  public void raiseAccountBalance(Long id) {
    BankAccount bankAccount = getAccountById(id);
    if (bankAccount.isKing()) {
      bankAccount.setBalance(bankAccount.getBalance() + 100);
    } else {
      bankAccount.setBalance(bankAccount.getBalance() + 10);
    }
    bankAccountRepository.save(bankAccount);
  }
}
