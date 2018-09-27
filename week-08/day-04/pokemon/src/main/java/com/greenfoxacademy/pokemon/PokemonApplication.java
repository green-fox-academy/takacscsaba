package com.greenfoxacademy.pokemon;

import com.greenfoxacademy.pokemon.models.Trainer;
import com.greenfoxacademy.pokemon.repositories.PokemonRepository;
import com.greenfoxacademy.pokemon.repositories.TrainerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokemonApplication implements CommandLineRunner {
  private final TrainerRepository trainerRepository;
  private final PokemonRepository pokemonRepository;

  public PokemonApplication(TrainerRepository trainerRepository, PokemonRepository pokemonRepository) {
    this.trainerRepository = trainerRepository;
    this.pokemonRepository = pokemonRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(PokemonApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    trainerRepository.save(new Trainer("Csabi", "charizard"));
//    trainerRepository.save(new Trainer("Friendless Baxter", "psyduck"));
  }
}
