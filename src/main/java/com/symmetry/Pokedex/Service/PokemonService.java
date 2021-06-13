package com.symmetry.Pokedex.Service;
import com.symmetry.Pokedex.Entities.Pokemon;
import com.symmetry.Pokedex.Repositories.PokemonRepository;
import com.symmetry.Pokedex.utilities.OffsetLimitPageable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {
    @Autowired
    PokemonRepository pokemonRepository;
    @Autowired
    PokemonRedisService pokemonRedisService;

    Logger logger = LoggerFactory.getLogger(PokemonService.class);

    // TODO: add bulk data
    public void createPokemonBulk(final List<Pokemon> pokemons) {
        pokemonRepository.saveAll(pokemons);
    }

    public void createPokemon(final Pokemon pokemon) {
        try {
            if(pokemonRepository.findById(pokemon.getId()).isEmpty()) {
                pokemonRepository.save(pokemon);
            }

        } catch(Exception e) {
            logger.error(String.valueOf(e));
        }

    }

    public Optional<Pokemon> getPokemonById(Integer id) {
        try {
            if (id != null) {
                Pokemon pokemonRedis = pokemonRedisService.getPokemon(String.valueOf(id));
                if (pokemonRedis != null) {
                    return Optional.of(pokemonRedis);
                } else {
                    Optional<Pokemon> pokemon = pokemonRepository.findById(id);
                    pokemonRedisService.setPokemon(pokemon.get());
                    return pokemon;
                }
            }
        } catch (Exception e) {
            logger.error(String.valueOf(e));
        }
        return Optional.empty();
    }

    public Iterable<Pokemon> getPokemonByPageAndOffset(Integer offset, Integer page, Integer limit) {
        try {
            if (offset != null && page != null && limit != null) {
                Iterable<Pokemon> pokemon = pokemonRepository.findAll(OffsetLimitPageable.func(offset, page, limit));
                return pokemon;
            }
        } catch (Exception e) {
            logger.error(String.valueOf(e));
        }
        return null;
    }

    public void deletePokemon(Integer id) {
        try {
            if (id !=  null)  {
                pokemonRepository.deleteById(id);
                pokemonRedisService.deletePokemon(String.valueOf(id));
            }
        } catch (Exception e) {
            logger.error(String.valueOf(e));
        }
    }
}

