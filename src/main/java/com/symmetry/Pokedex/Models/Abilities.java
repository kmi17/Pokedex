package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Abilities implements Serializable {
    private int slot;
    private Ability ability;
    private boolean is_hidden;

    public Abilities() {
    }

    public Abilities(int slot, Ability ability, boolean is_hidden) {
        this.slot = slot;
        this.ability = ability;
        this.is_hidden = is_hidden;
    }

    public boolean is_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
