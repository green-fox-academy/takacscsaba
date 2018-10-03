package com.grefoxacademy.p2pchat.repositories;

import com.grefoxacademy.p2pchat.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findByName(String name);
  List<User> findAll();
}
