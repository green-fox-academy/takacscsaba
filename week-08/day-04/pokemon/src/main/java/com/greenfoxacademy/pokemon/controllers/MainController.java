package com.greenfoxacademy.pokemon.controllers;

import com.greenfoxacademy.pokemon.models.Trainer;
import com.greenfoxacademy.pokemon.repositories.PokemonRepository;
import com.greenfoxacademy.pokemon.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  private PokemonRepository pokemonRepository;
  private TrainerRepository trainerRepository;
  Long loggedInTrainerId;

  @Autowired
  public MainController(PokemonRepository pokemonRepository, TrainerRepository trainerRepository) {
    this.pokemonRepository = pokemonRepository;
    this.trainerRepository = trainerRepository;
  }

  @GetMapping("/")
  public String redirecter() {
    return "redirect:/login";
  }


  @GetMapping("/index")
  public String indexPage(Model model) {
    model.addAttribute("trainer", trainerRepository.findByTrainerid(loggedInTrainerId));
    return "index";
  }

  @GetMapping("/login")
  public String loginPage(Model model) {
    model.addAttribute("trainer", new Trainer());
    return "login";
  }

  @PostMapping("/login")
  public String loggingIn(@ModelAttribute Trainer trainer) {
    if (trainerRepository.findByTrainername(trainer.getTrainername()) != null) {
      trainerRepository.save(trainer);
      if (trainer.getTrainerpassword().equals(trainerRepository.findFirstByTrainername(trainer.getTrainername()).getTrainerpassword())) {
        idSaver(trainerRepository.findFirstByTrainername(trainer.getTrainername()));
        trainerRepository.delete(trainer);
        return "redirect:/index";
      }
      trainerRepository.delete(trainer);
    }
    return "redirect:/";
  }

  public void idSaver(Trainer trainer) {
    this.loggedInTrainerId = trainer.getTrainerid();
  }

}
