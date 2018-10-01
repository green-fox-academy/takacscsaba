package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.DoUntil;
import com.greenfoxacademy.restbackend.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
  private Result result;

  @Autowired
  public MainServiceImpl(Result result) {
    this.result = result;
  }

  @Override
  public Result factorNumber(DoUntil doUntil) {
    int factor = 1;
    for (int i = 1; i <= doUntil.getUntil(); i++) {
      factor *= i;
    }
    result.setResult(factor);
    return result;
  }

  @Override
  public Result sumNumber(DoUntil doUntil) {
    int sum = 0;
    for (int i = 0; i <= doUntil.getUntil(); i++) {
      sum += i;
    }
    result.setResult(sum);
    return result;
  }

  public Result getResult() {
    return result;
  }
}
