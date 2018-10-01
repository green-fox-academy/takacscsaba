package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {
  Result makeItDouble(Doubled doubled);

  Result factorNumber(DoUntil doUntil);

  Result sumNumber(DoUntil doUntil);

  Result sumArray(ArrayObject arrayObject);

  Result multiplyArray(ArrayObject arrayObject);

  Result doubleArray(ArrayObject arrayObject);

  void saveLog(String endpoint, String data);

  List<LogObject> listAllLog();
}
