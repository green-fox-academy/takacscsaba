package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository {

  BankAccount getBankAccount();

}
