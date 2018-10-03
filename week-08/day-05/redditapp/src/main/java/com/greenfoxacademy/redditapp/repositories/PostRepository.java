package com.greenfoxacademy.redditapp.repositories;

import com.greenfoxacademy.redditapp.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
  List<Post> findAll();

  Post findAllById(Long id);
}
