package com.greenfoxacademy.springstart.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@Controller
public class HelloWebController {
  private final AtomicLong atomicLong = new AtomicLong();
  String[] hellos = {"こんにちは", "Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Dobar dan",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public String textColor() {
    int r = (int) (Math.random() * 255);
    int g = (int) (Math.random() * 255);
    int b = (int) (Math.random() * 255);
    String rgbColors = "rgb(" + r + "," + g + "," + b + ")";
    return rgbColors;

  }

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(name = "name") String name) {
    model.addAttribute("fontcolor", textColor());
    model.addAttribute("fontsize", (int) Math.floor(8 + Math.random() * 32));
    model.addAttribute("hello", hellos[(int) (Math.random() * hellos.length)]);
    model.addAttribute("name", name);
    model.addAttribute("number", atomicLong.incrementAndGet());
    return "greeting";
  }
}
