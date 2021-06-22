package com.symmetry.Pokedex.Service;

import com.symmetry.Pokedex.Entities.Pokemon;
import com.symmetry.Pokedex.Models.APIResourceList;
import com.symmetry.Pokedex.utilities.PokeData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeAPIRESTService {
        Logger logger = LoggerFactory.getLogger(PokeData.class);
        private final RestTemplate restTemplate;

        public PokeAPIRESTService(RestTemplateBuilder restTemplateBuilder) {
            this.restTemplate = restTemplateBuilder.build();
        }

        public Integer getTotalPokemon(String url) {
            try {
                APIResourceList pokemonResource = this.restTemplate.getForObject(url, APIResourceList.class);
                return pokemonResource.getCount();
            } catch (Exception e) {
                logger.error(String.valueOf(e));
            }
            return null;
        }
        public APIResourceList getPokemonPlainJSON(String url) {
            return this.restTemplate.getForObject(url, APIResourceList.class);
        }
        public Pokemon getPokemon(String url) {
            return this.restTemplate.getForObject(url, Pokemon.class);
        }
}
