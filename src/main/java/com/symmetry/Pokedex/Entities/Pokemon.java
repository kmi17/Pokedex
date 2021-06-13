package com.symmetry.Pokedex.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.symmetry.Pokedex.Models.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;
@Data
@Document(indexName = "pokemon", createIndex = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon implements Serializable {
    @Id
    public int id;
    public String name;
    public int base_experience;
    public int height;
    public boolean is_default;
    public int order;
    public int weight;

    public List<Abilities> abilities;
    public List<Form> forms;
    public List<GameIndice> game_indices;
    public List<HeldItem> held_items;
    public String location_area_encounters;
    public List<Moves> moves;
    public Species species;
    public Sprites sprites;
    public List<Stat> stats;
    public List<Types> types;

    public Pokemon() {
    }

    public Pokemon(int id, String name, int base_experience, int height, boolean is_default, int order, int weight, List<Abilities> abilities, List<Form> forms, List<GameIndice> game_indices, List<HeldItem> held_items, String location_area_encounters, List<Moves> moves, Species species, Sprites sprites, List<Stat> stats, List<Types> types) {
        this.id = id;
        this.name = name;
        this.base_experience = base_experience;
        this.height = height;
        this.is_default = is_default;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.forms = forms;
        this.game_indices = game_indices;
        this.held_items = held_items;
        this.location_area_encounters = location_area_encounters;
        this.moves = moves;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
    }
}
