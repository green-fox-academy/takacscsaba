package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Doubled;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

    @GetMapping("/doubling")
    public Object makingDouble(@RequestParam(value = "input", required = false) Integer received) {
        if (received != null) {
            Doubled doubled = new Doubled(received);
            return doubled;
        } else {
            return new ErrorMessage();
        }
    }
}
