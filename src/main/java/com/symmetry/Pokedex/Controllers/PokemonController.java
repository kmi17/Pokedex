package com.symmetry.Pokedex.Controllers;

import com.symmetry.Pokedex.Entities.Pokemon;
import com.symmetry.Pokedex.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    public Optional<Pokemon> getPokemon(@RequestParam int id) {
        return pokemonService.getPokemonById(id);
    }

    @GetMapping("/paginated/pokemon")
    public Iterable<Pokemon> getPokemonByPageAndOffset(@RequestParam int offset, @RequestParam int page, @RequestParam int limit) {
        return pokemonService.getPokemonByPageAndOffset(offset, page, limit);
    }

    @DeleteMapping("/pokemon")
    public String deletePokemonById(@RequestParam int id) {
        pokemonService.deletePokemon(id);
        return "Deleted";
    }
}
