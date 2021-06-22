package com.symmetry.Pokedex;

import com.symmetry.Pokedex.Entities.Pokemon;
import com.symmetry.Pokedex.Service.PokemonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class PokedexApplicationTests {

    @Autowired
    private PokemonService pokemonService;

    @Test
    public void checkById() {
        Assert.assertEquals("bulbasaur", pokemonService.getPokemonById(1).get().getName());
    }

    @Test
    public void checkByPagination(){
        int expectedCount = 0;
        Iterator<Pokemon> it = pokemonService.getPokemonByPageAndOffset(0,0,20).iterator();
        while(it.hasNext()){
            expectedCount++;
            it.next();
        }
        Assert.assertEquals(20, expectedCount);
    }


    @Test
    public void checkDelete(){
        pokemonService.deletePokemon(2);
        Assert.assertEquals(Optional.empty(), pokemonService.getPokemonById(2));
    }


}
