package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.DoUntil;
import com.greenfoxacademy.restbackend.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
  private DoUntil doUntil;
  private Result result;

  @Autowired
  public MainServiceImpl(DoUntil doUntil, Result result) {
    this.doUntil = doUntil;
    this.result = result;
  }

  @Override
  public void factorNumber(DoUntil doUntil) {
    int factor = 0;
    for (int i = 0; i <= doUntil.getUntil(); i++) {
      factor *= i;
    }
    result.setResult(factor);
  }

  @Override
  public void sumNumber(DoUntil doUntil) {
    int sum = 0;
    for (int i = 0; i <= doUntil.getUntil(); i++) {
      sum += i;
    }
    result.setResult(sum);
  }

  public Result getResult() {
    return result;
  }
}
