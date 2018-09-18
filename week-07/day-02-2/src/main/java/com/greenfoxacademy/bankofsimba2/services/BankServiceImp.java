package com.greenfoxacademy.bankofsimba2.services;

import com.greenfoxacademy.bankofsimba2.models.Animal;
import com.greenfoxacademy.bankofsimba2.models.BankAccount;
import com.greenfoxacademy.bankofsimba2.repositories.AnimalRepository;
import com.greenfoxacademy.bankofsimba2.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BankServiceImp implements BankServiceInt {
  @Autowired
  private BankAccountRepository bankAccountRepository;
  @Autowired
  private AnimalRepository animalRepository;

  @Autowired
  public BankServiceImp(BankAccountRepository bankAccountRepository, AnimalRepository animalRepository) {
    this.bankAccountRepository = bankAccountRepository;
    this.animalRepository = animalRepository;
  }

  @Override
  public BankAccount createBankAccount(String bankAccountName) {
    BankAccount bankAccount = new BankAccount(bankAccountName);
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
  @Transactional
  public BankAccount addAnimal(Long bankAccountId, Animal newAnimal) {
    BankAccount bankAccount = bankAccountRepository.findById(bankAccountId).get();
    bankAccount.addAnimal(newAnimal);
    bankAccountRepository.save(bankAccount);
    return bankAccount;
  }

  private void removeAnimalFromBankAccount(BankAccount bankAccount, Animal animal) {
    Animal animalToRemove = findAnimal(bankAccount, animal);
    if (animalToRemove != null) {
      bankAccount.getAnimals().remove(animalToRemove);
      bankAccountRepository.save(bankAccount);
    }
  }

  private Animal findAnimal(BankAccount bankAccount, Animal animal) {
    for (Animal bankAccountAnimal : bankAccount.getAnimals()) {
      if (bankAccountAnimal.getId() == animal.getId()) {
        return bankAccountAnimal;
      }
    }
    return null;
  }
}
