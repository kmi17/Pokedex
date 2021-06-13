package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GenerationV implements Serializable {

    @JsonProperty("black-white")
    private BlackWhite blackWhite;

    public GenerationV() {
    }

    public GenerationV(BlackWhite blackWhite) {
        this.blackWhite = blackWhite;
    }

    public BlackWhite getBlackWhite() {
        return blackWhite;
    }

    public void setBlackWhite(BlackWhite blackWhite) {
        this.blackWhite = blackWhite;
    }

}
