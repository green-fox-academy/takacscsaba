package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.BankAccountRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BankServiceImp implements BankServiceInt {
  BankAccountRepository bankAccountRepository;

  public BankServiceImp(BankAccountRepository bankAccountRepository) {
    this.bankAccountRepository = bankAccountRepository;
  }

  @Override
  public BankAccount createBankAccount(String shelterName) {
    BankAccount bankAccount = new BankAccount();
    bankAccountRepository.save(bankAccount);
    return bankAccount;
  }

  @Override
  public List<BankAccount> getBankAccounts() {
    return bankAccountRepository.findAll();
  }

  @Override
  public BankAccount getBankAccountById(Long id) {
    return bankAccountRepository.findById(id).get();
  }

  @Override
  public BankAccount addBankAccount(Long shelterId, BankAccount newBankAccount) {
    return null;
  }
}
