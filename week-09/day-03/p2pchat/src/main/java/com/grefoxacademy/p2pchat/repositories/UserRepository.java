package com.grefoxacademy.p2pchat.repositories;

import com.grefoxacademy.p2pchat.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
