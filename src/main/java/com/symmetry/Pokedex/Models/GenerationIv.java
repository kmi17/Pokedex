package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GenerationIv implements Serializable {
    @JsonProperty("diamond-pearl")
    private DiamondPearl diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    private HeartgoldSoulsilver heartgoldSoulsilver;
    private Platinum platinum;

    public GenerationIv() {
    }

    public GenerationIv(DiamondPearl diamondPearl, HeartgoldSoulsilver heartgoldSoulsilver, Platinum platinum) {
        this.diamondPearl = diamondPearl;
        this.heartgoldSoulsilver = heartgoldSoulsilver;
        this.platinum = platinum;
    }

    public DiamondPearl getDiamondPearl() {
        return diamondPearl;
    }

    public void setDiamondPearl(DiamondPearl diamondPearl) {
        this.diamondPearl = diamondPearl;
    }

    public HeartgoldSoulsilver getHeartgoldSoulsilver() {
        return heartgoldSoulsilver;
    }

    public void setHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver) {
        this.heartgoldSoulsilver = heartgoldSoulsilver;
    }

    public Platinum getPlatinum() {
        return platinum;
    }

    public void setPlatinum(Platinum platinum) {
        this.platinum = platinum;
    }


}
