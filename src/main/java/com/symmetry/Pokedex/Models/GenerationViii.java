package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class GenerationViii implements Serializable {

    private Icons icons;

    public GenerationViii() {
    }

    public GenerationViii(Icons icons) {
        this.icons = icons;
    }

    public Icons getIcons() {
        return icons;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }

}
