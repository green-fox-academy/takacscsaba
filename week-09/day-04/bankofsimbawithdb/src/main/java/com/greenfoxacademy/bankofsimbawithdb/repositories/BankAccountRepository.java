package com.greenfoxacademy.bankofsimbawithdb.repositories;

import com.greenfoxacademy.bankofsimbawithdb.models.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
}
