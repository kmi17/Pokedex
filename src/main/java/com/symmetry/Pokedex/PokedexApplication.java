package com.symmetry.Pokedex;

import com.symmetry.Pokedex.utilities.PokeData;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.common.settings.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.FileNotFoundException;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) throws FileNotFoundException {
		ApplicationContext applicationContext = SpringApplication.run(PokedexApplication.class, args);
		PokeData readerService = applicationContext.getBean(PokeData.class);
		readerService.indexPokemon();
	}


}
