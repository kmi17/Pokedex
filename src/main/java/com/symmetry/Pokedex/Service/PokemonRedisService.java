package com.symmetry.Pokedex.Service;

import com.symmetry.Pokedex.Configs.Config;
import com.symmetry.Pokedex.Entities.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonRedisService {
    @Autowired
    Config redisConfig;

    public Pokemon getPokemon(String key){
        // opsForValue is a client that reads value from redis
        ValueOperations values = redisConfig.redisTemplate().opsForValue();
        System.out.println(key);
        return (Pokemon) values.get(key);
    }

    public void setPokemon(Pokemon pokemon){
        // opsForValue is a client that set value to redis
        ValueOperations values = redisConfig.redisTemplate().opsForValue();
        String key = String.valueOf(pokemon.getId());
        System.out.println(key);
        try {
            values.set(key, pokemon);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void setPokemon(Iterable<Pokemon> pokemon, int offset, int page, int limit){
        // opsForValue is a client that set value to redis
        ValueOperations values = redisConfig.redisTemplate().opsForValue();
        String key = offset + "_" + page + "_" + limit;
        System.out.println(key);
        try {
            values.set(key, pokemon);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void deletePokemon(String key) {
     redisConfig.redisTemplate().delete(key);
    }
}
