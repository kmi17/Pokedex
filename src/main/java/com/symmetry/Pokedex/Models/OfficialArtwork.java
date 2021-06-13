package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class OfficialArtwork implements Serializable {
    private String front_default;

    public OfficialArtwork() {
    }

    public OfficialArtwork(String front_default) {
        this.front_default = front_default;
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }
}
