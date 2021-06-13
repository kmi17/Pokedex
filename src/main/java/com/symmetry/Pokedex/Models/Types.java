package com.symmetry.Pokedex.Models;

import java.io.Serializable;
import java.util.List;

public class Types implements Serializable {
    private int slot;
    private Type type;

    public Types() {
    }

    public Types(int slot, Type type) {
        this.slot = slot;
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
