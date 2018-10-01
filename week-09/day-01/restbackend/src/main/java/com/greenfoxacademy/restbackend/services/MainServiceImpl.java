package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.ArrayObject;
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

  @Override
  public Result sumArray(ArrayObject arrayObject) {
    int sum = 0;
    for (int i = 0; i < arrayObject.getNumbers().length; i++) {
      sum += arrayObject.getNumbers()[i];
    }
    result.setResult(sum);
    return result;
  }

  @Override
  public Result multiplyArray(ArrayObject arrayObject) {
    int multiplied = 1;
    for (int i = 0; i < arrayObject.getNumbers().length; i++) {
      multiplied *= arrayObject.getNumbers()[i];
    }
    result.setResult(multiplied);
    return result;
  }

  @Override
  public Result doubleArray(ArrayObject arrayObject) {
    int doubledArray[] = new int[arrayObject.getNumbers().length];

    for (int i = 0; i < arrayObject.getNumbers().length; i++) {
      doubledArray[i] = arrayObject.getNumbers()[i] * 2;
    }
    result.setResultArray(doubledArray);
    return result;
  }
}
