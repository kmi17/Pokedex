package com.symmetry.Pokedex.utilities;

import com.symmetry.Pokedex.Entities.Pokemon;
import com.symmetry.Pokedex.Models.APIResourceList;
import com.symmetry.Pokedex.Models.Result;
import com.symmetry.Pokedex.Service.PokeAPIRESTService;
import com.symmetry.Pokedex.Service.PokemonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;
@Service
public class PokeData {
    @Value("${pokeapi}")
    public String pokeapiBaseURL;
    public String getPokeapiBaseURL() {
        return pokeapiBaseURL;
    }
    Logger logger = LoggerFactory.getLogger(PokeData.class);
    @Autowired
    PokemonService pokemonService;

    @Autowired
    PokeAPIRESTService pokeAPIRESTService;

    public void savePokemonData() throws FileNotFoundException {
        Integer pokemonCount = pokeAPIRESTService.getTotalPokemon(getPokeapiBaseURL() +"?offset=0&limit=0");
        APIResourceList pokemonList;
        int offset = 0;
        int limit = 20;
        while (offset <= pokemonCount) {
            pokemonList = pokeAPIRESTService.getPokemonPlainJSON(getPokeapiBaseURL()+"?offset="+offset+"&"+"limit="+limit);
            List<Result> results = pokemonList.getResults();

            for (Result result : results) {
                Pokemon pokemon = pokeAPIRESTService.getPokemon(result.getUrl());
                pokemonService.createPokemon(pokemon);
            }
            offset = offset + 20;
        }
    }

}
