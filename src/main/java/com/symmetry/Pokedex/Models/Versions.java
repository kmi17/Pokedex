package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Versions implements Serializable {
    @JsonProperty("generation-i")
    private GenerationI generationI;
    @JsonProperty("generation-ii")
    private GenerationIi generationIi;
    @JsonProperty("generation-iii")
    private GenerationIii generationIii;
    @JsonProperty("generation-iv")
    private GenerationIv generationIv;
    @JsonProperty("generation-v")
    private GenerationV generationV;
    @JsonProperty("generation-vi")
    private GenerationVi generationVi;
    @JsonProperty("generation-vii")
    private GenerationVii generationVii;
    @JsonProperty("generation-viii")
    private GenerationViii generationViii;

    public Versions() {
    }

    public Versions(GenerationI generationI, GenerationIi generationIi, GenerationIii generationIii, GenerationIv generationIv, GenerationV generationV, GenerationVi generationVi, GenerationVii generationVii, GenerationViii generationViii) {
        this.generationI = generationI;
        this.generationIi = generationIi;
        this.generationIii = generationIii;
        this.generationIv = generationIv;
        this.generationV = generationV;
        this.generationVi = generationVi;
        this.generationVii = generationVii;
        this.generationViii = generationViii;
    }

    public GenerationI getGenerationI() {
        return generationI;
    }

    public void setGenerationI(GenerationI generationI) {
        this.generationI = generationI;
    }

    public GenerationIi getGenerationIi() {
        return generationIi;
    }

    public void setGenerationIi(GenerationIi generationIi) {
        this.generationIi = generationIi;
    }

    public GenerationIii getGenerationIii() {
        return generationIii;
    }

    public void setGenerationIii(GenerationIii generationIii) {
        this.generationIii = generationIii;
    }

    public GenerationIv getGenerationIv() {
        return generationIv;
    }

    public void setGenerationIv(GenerationIv generationIv) {
        this.generationIv = generationIv;
    }

    public GenerationV getGenerationV() {
        return generationV;
    }

    public void setGenerationV(GenerationV generationV) {
        this.generationV = generationV;
    }

    public GenerationVi getGenerationVi() {
        return generationVi;
    }

    public void setGenerationVi(GenerationVi generationVi) {
        this.generationVi = generationVi;
    }

    public GenerationVii getGenerationVii() {
        return generationVii;
    }

    public void setGenerationVii(GenerationVii generationVii) {
        this.generationVii = generationVii;
    }

    public GenerationViii getGenerationViii() {
        return generationViii;
    }

    public void setGenerationViii(GenerationViii generationViii) {
        this.generationViii = generationViii;
    }
}
