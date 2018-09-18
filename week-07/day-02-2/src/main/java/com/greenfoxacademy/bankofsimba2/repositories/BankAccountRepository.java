package com.greenfoxacademy.bankofsimba2.repositories;

import com.greenfoxacademy.bankofsimba2.models.BankAccount;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {

  List<BankAccount> findAll();

}
