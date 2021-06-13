package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class Emerald implements Serializable {
    private String front_default;
    private String front_shiny;

    public Emerald() {
    }

    public Emerald(String front_default, String front_shiny) {
        this.front_default = front_default;
        this.front_shiny = front_shiny;
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    public String getFront_shiny() {
        return front_shiny;
    }

    public void setFront_shiny(String front_shiny) {
        this.front_shiny = front_shiny;
    }
}
