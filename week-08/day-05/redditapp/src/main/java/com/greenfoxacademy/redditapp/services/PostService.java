package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
  List<Post> getPostList();

  void countIncreaser(Long id);

  void countDecreaser(Long id);
}
