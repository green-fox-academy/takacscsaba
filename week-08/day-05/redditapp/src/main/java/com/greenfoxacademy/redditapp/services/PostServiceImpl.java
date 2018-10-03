package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Post;
import com.greenfoxacademy.redditapp.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
  private PostRepository postRepository;

  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getPostList() {
    return postRepository.findAll();
  }
}
