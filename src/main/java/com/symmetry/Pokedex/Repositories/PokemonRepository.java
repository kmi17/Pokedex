package com.symmetry.Pokedex.Repositories;

import com.symmetry.Pokedex.Entities.Pokemon;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/*
PokemonRepository class inherits the methods like save(), saveAll(), find(), and findAll()
 */
public interface PokemonRepository extends ElasticsearchRepository<Pokemon, Integer> {
}
