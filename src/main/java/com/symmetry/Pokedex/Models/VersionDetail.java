package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class VersionDetail implements Serializable {
    private int rarity;
    private Version version;

    public VersionDetail() {
    }

    public VersionDetail(int rarity, Version version) {
        this.rarity = rarity;
        this.version = version;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
