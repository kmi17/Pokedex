package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class Name implements Serializable {
    private String name;
    private Language language;

    public Name() {
    }

    public Name(String name, Language language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
