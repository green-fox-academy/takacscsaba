package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.DoUntil;
import com.greenfoxacademy.restbackend.models.Result;
import org.springframework.stereotype.Service;

@Service
public interface MainService {
  Result factorNumber(DoUntil doUntil);
  Result sumNumber(DoUntil doUntil);
  Result getResult();
}
