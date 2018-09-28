package com.greenfoxacademy.pokemon.controllers;

import com.greenfoxacademy.pokemon.models.Pokemon;
import com.greenfoxacademy.pokemon.models.Trainer;
import com.greenfoxacademy.pokemon.repositories.PokemonRepository;
import com.greenfoxacademy.pokemon.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
  private PokemonRepository pokemonRepository;
  private TrainerRepository trainerRepository;
  private Long loggedInTrainerId;

  @Autowired
  public MainController(PokemonRepository pokemonRepository, TrainerRepository trainerRepository) {
    this.pokemonRepository = pokemonRepository;
    this.trainerRepository = trainerRepository;
  }

  @GetMapping("/")
  public String redirecter() {
    if (loggedInTrainerId == null) {
      return "redirect:/login";
    } else {
      return "redirect:/index";
    }
  }

  @GetMapping("/index")
  public String indexPage(Model model) {
//    pokemonSetter();
    if (loggedInTrainerId != null) {
      model.addAttribute("trainer", trainerRepository.findByTrainerid(loggedInTrainerId));
      model.addAttribute("pokemons", pokemonRepository.findAll());

//      model.addAttribute("pokemonsOfTrainer", pokemonRepository.findByTrainerTrainerid(trainerRepository.findByTrainerid(loggedInTrainerId).getTrainerid()));
      model.addAttribute("pokemonsOfTrainer", trainerRepository.findByTrainerid(loggedInTrainerId).getPokemons());
      return "index";
    }
    return "redirect:/login";
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

  @PostMapping("/addpokemon")
  public String addPokemon(@RequestParam(value = "pokemonName") String pokemonName) {
    Pokemon pokemon = pokemonRepository.findByTname(pokemonName);
    Trainer trainer = trainerRepository.findByTrainerid(loggedInTrainerId);
    trainer.getPokemons().add(pokemon);
//    pokemon.setTrainer(trainer);
//    pokemonRepository.save(pokemon);
    trainerRepository.save(trainer);
    return "redirect:/index";
  }

  @PostMapping("/removepokemon")
  public String removePokemon(@RequestParam(value = "pokemonId") Long pokemonId) {
    Pokemon pokemon = pokemonRepository.findByPid(pokemonId);
    Trainer trainer = trainerRepository.findByTrainerid(loggedInTrainerId);
    trainer.getPokemons().remove(pokemon);
//    pokemon.setTrainerNull();
    pokemonRepository.save(pokemon);
    trainerRepository.save(trainer);
    return "redirect:/index";
  }

  @GetMapping("/register")
  public String registerPage(@ModelAttribute String warning, Model model) {
    model.addAttribute("warning", warning);
    model.addAttribute("trainer", new Trainer());
    return "register";
  }

  @PostMapping("/register")
  public String registerNewTrainer(@ModelAttribute Trainer trainer,
                                   Model model) {
    if (trainerRepository.findByTrainername(trainer.getTrainername()) == null) {
      trainerRepository.save(trainer);
      return "redirect:/login";
    }
    model.addAttribute("warning", "Name already exists!!");
    return "redirect:/register";
  }


  public void pokemonSetter() {
    List<Pokemon> csabiPoke = new ArrayList<>();
    csabiPoke.add(pokemonRepository.findByTname("Charizard"));
    csabiPoke.add(pokemonRepository.findByTname("Kadabra"));
    csabiPoke.add(pokemonRepository.findByTname("Scyther"));

    trainerRepository.findByTrainername("Csabi").setPokemons(csabiPoke);
    trainerRepository.save(trainerRepository.findByTrainername("Csabi"));
//    pokemonRepository.findByTname("Charizard").setTrainer(trainerRepository.findByTrainername("Csabi"));
//    pokemonRepository.findByTname("Kadabra").setTrainer(trainerRepository.findByTrainername("Csabi"));
//    pokemonRepository.findByTname("Scyther").setTrainer(trainerRepository.findByTrainername("Csabi"));
    pokemonRepository.save(pokemonRepository.findByTname("Charizard"));
    pokemonRepository.save(pokemonRepository.findByTname("Kadabra"));
    pokemonRepository.save(pokemonRepository.findByTname("Scyther"));


    List<Pokemon> kocsogPoke = new ArrayList<>();
    kocsogPoke.add(pokemonRepository.findByTname("Psyduck"));
    kocsogPoke.add(pokemonRepository.findByTname("Ditto"));
    kocsogPoke.add(pokemonRepository.findByTname("Zubat"));

    trainerRepository.findByTrainername("Koumon").setPokemons(kocsogPoke);
    trainerRepository.save(trainerRepository.findByTrainername("Koumon"));
//    pokemonRepository.findByTname("Psyduck").setTrainer(trainerRepository.findByTrainername("Koumon"));
//    pokemonRepository.findByTname("Ditto").setTrainer(trainerRepository.findByTrainername("Koumon"));
//    pokemonRepository.findByTname("Zubat").setTrainer(trainerRepository.findByTrainername("Koumon"));
    pokemonRepository.save(pokemonRepository.findByTname("Psyduck"));
    pokemonRepository.save(pokemonRepository.findByTname("Ditto"));
    pokemonRepository.save(pokemonRepository.findByTname("Zubat"));
  }
}
