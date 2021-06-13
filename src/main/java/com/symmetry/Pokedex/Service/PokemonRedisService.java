package com.symmetry.Pokedex.Service;

import com.symmetry.Pokedex.Configs.Config;
import com.symmetry.Pokedex.Entities.Pokemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonRedisService {
    @Autowired
    Config redisConfig;

    Logger logger = LoggerFactory.getLogger(PokemonRedisService.class);

    public Pokemon getPokemon(String key){
        ValueOperations values = redisConfig.redisTemplate().opsForValue();
        System.out.println(key);
        return (Pokemon) values.get(key);
    }

    public void setPokemon(Pokemon pokemon){
        ValueOperations values = redisConfig.redisTemplate().opsForValue();
        String key = String.valueOf(pokemon.getId());
        System.out.println(key);
        try {
            values.set(key, pokemon);
        } catch (Exception e){
            logger.error(String.valueOf(e));
        }
    }
    // TODO: Add a list of pokemon in the redis
    public void setPokemon(Iterable<Pokemon> pokemon, int offset, int page, int limit){
        ValueOperations values = redisConfig.redisTemplate().opsForValue();
        String key = offset + "_" + page + "_" + limit;
        try {
            values.set(key, pokemon);
        } catch (Exception e){
            logger.error(String.valueOf(e));
        }
    }
    public void deletePokemon(String key) {
     redisConfig.redisTemplate().delete(key);
    }
}
