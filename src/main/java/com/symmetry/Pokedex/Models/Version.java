package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class Version implements Serializable {
    private String name;
    private String url;

    public Version() {
    }

    public Version(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}