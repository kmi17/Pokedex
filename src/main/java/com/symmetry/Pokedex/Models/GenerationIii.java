package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GenerationIii implements Serializable {
    private Emerald emerald;
    @JsonProperty("firered-leafgreen")
    private FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire")
    private RubySapphire rubySapphire;

    public GenerationIii() {
    }

    public GenerationIii(Emerald emerald, FireredLeafgreen fireredLeafgreen, RubySapphire rubySapphire) {
        this.emerald = emerald;
        this.fireredLeafgreen = fireredLeafgreen;
        this.rubySapphire = rubySapphire;
    }

    public Emerald getEmerald() {
        return emerald;
    }

    public void setEmerald(Emerald emerald) {
        this.emerald = emerald;
    }

    public FireredLeafgreen getFireredLeafgreen() {
        return fireredLeafgreen;
    }

    public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
    }

    public RubySapphire getRubySapphire() {
        return rubySapphire;
    }

    public void setRubySapphire(RubySapphire rubySapphire) {
        this.rubySapphire = rubySapphire;
    }
}
