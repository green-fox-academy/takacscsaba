package com.grefoxacademy.p2pchat.repositories;

import com.grefoxacademy.p2pchat.models.Messages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Messages, Long> {

}
