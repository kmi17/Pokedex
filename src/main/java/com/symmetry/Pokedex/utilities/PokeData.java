package com.symmetry.Pokedex.utilities;

import com.symmetry.Pokedex.Configs.Config;
import com.symmetry.Pokedex.Entities.Pokemon;
import com.symmetry.Pokedex.Models.APIResourceList;
import com.symmetry.Pokedex.Models.Result;
import com.symmetry.Pokedex.Service.PokemonRESTService;
import com.symmetry.Pokedex.Service.PokemonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;
@Service
public class PokeData {
    Logger logger = LoggerFactory.getLogger(PokeData.class);
    @Autowired
    PokemonService pokemonService;

    @Autowired
    PokemonRESTService pokemonRESTService;

    public void indexPokemon() throws FileNotFoundException {
        Integer pokemonCount = pokemonRESTService.getCount();
        APIResourceList pokemonList;
        int offset = 0;
        int limit = 20;
        String url = "https://pokeapi.co/api/v2/pokemon";
        while (offset <= pokemonCount) {
            pokemonList = pokemonRESTService.getPokemonPlainJSON(url+"?offset="+offset+"&"+"limit="+limit);
            List<Result> results = pokemonList.getResults();

            for (Result result : results) {
                Pokemon pokemon = pokemonRESTService.getPokemon(result.getUrl());
                pokemonService.createPokemon(pokemon);
            }
            offset = offset + 20;
        }
    }

}
