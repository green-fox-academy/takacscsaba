package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.DoUntil;
import com.greenfoxacademy.restbackend.models.Result;
import org.springframework.stereotype.Service;

@Service
public interface MainService {
  void factorNumber(DoUntil doUntil);
  void sumNumber(DoUntil doUntil);
  Result getResult();
}
