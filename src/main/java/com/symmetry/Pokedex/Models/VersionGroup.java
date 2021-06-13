package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class VersionGroup implements Serializable {
    private String name;
    private String url;

    public VersionGroup() {
    }

    public VersionGroup(String name, String url) {
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
