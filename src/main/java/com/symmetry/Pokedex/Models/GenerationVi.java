package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GenerationVi implements Serializable {
    @JsonProperty("omegaruby-alphasapphire")
    private OmegarubyAlphasapphire omegarubyAlphasapphire;
    @JsonProperty("x-y")
    private XY xY;

    public GenerationVi() {
    }

    public GenerationVi(OmegarubyAlphasapphire omegarubyAlphasapphire, XY xY) {
        this.omegarubyAlphasapphire = omegarubyAlphasapphire;
        this.xY = xY;
    }

    public OmegarubyAlphasapphire getOmegarubyAlphasapphire() {
        return omegarubyAlphasapphire;
    }

    public void setOmegarubyAlphasapphire(OmegarubyAlphasapphire omegarubyAlphasapphire) {
        this.omegarubyAlphasapphire = omegarubyAlphasapphire;
    }

    public XY getxY() {
        return xY;
    }

    public void setxY(XY xY) {
        this.xY = xY;
    }


}
