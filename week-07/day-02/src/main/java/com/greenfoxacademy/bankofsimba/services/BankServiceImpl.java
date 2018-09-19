package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.Animal;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.AnimalRepository;
import com.greenfoxacademy.bankofsimba.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BankServiceImpl implements BankService {
  @Autowired
  private BankAccountRepository bankAccountRepositoryImpl;
  private AnimalRepository animalRepository;

  public BankServiceImpl(){

  }

  public BankServiceImpl(BankAccountRepository bankAccountRepositoryImpl, AnimalRepository animalRepository) {
    this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
    this.animalRepository = animalRepository;
  }

//  @Override
//  public BankAccount createBankAccount(String bankAccountName) {
//    BankAccount bankAccount = new BankAccount(bankAccountName);
//    bankAccountRepositoryImpl.save(bankAccount);
//    return bankAccount;
//  }
//
//  @Override
//  public BankAccount getBankAccounts() {
//    return bankAccountRepositoryImpl.getBankAccount();
//  }
//
//  @Override
//  public BankAccount getBankAccountById(Long id) {
//    return bankAccountRepositoryImpl.findById(id).get();
//  }

//  @Override
//  @Transactional
//  public BankAccount addAnimal(Long bankAccountId, Animal newAnimal) {
//    BankAccount bankAccount = bankAccountRepositoryImpl.findById(bankAccountId).get();
//    bankAccount.addAnimal(newAnimal);
//    bankAccountRepositoryImpl.save(bankAccount);
//    return bankAccount;
//  }

//  private void removeAnimalFromBankAccount(BankAccount bankAccount, Animal animal) {
//    Animal animalToRemove = findAnimal(bankAccount, animal);
//    if (animalToRemove != null) {
//      bankAccount.getAnimals().remove(animalToRemove);
//      bankAccountRepositoryImpl.save(bankAccount);
//    }
//  }

  private Animal findAnimal(BankAccount bankAccount, Animal animal) {
    for (Animal bankAccountAnimal : bankAccount.getAnimals()) {
      if (bankAccountAnimal.getId() == animal.getId()) {
        return bankAccountAnimal;
      }
    }
    return null;
  }
}
