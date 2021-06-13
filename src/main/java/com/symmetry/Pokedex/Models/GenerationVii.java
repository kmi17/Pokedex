package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GenerationVii implements Serializable {
    private Icons icons;
    @JsonProperty("ultra-sun-ultra-moon")
    private UltraSunUltraMoon ultraSunUltraMoon;

    public GenerationVii() {
    }

    public GenerationVii(Icons icons, UltraSunUltraMoon ultraSunUltraMoon) {
        this.icons = icons;
        this.ultraSunUltraMoon = ultraSunUltraMoon;
    }

    public Icons getIcons() {
        return icons;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }

    public UltraSunUltraMoon getUltraSunUltraMoon() {
        return ultraSunUltraMoon;
    }

    public void setUltraSunUltraMoon(UltraSunUltraMoon ultraSunUltraMoon) {
        this.ultraSunUltraMoon = ultraSunUltraMoon;
    }

}
