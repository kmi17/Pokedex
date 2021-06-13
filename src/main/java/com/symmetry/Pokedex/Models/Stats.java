package com.symmetry.Pokedex.Models;

import java.io.Serializable;
import java.util.List;

public class Stats implements Serializable {
    private int base_stat;
    private int effort;
    private List<Stat> stat;

    public Stats() {
    }

    public Stats(int base_stat, int effort, List<Stat> stat) {
        this.base_stat = base_stat;
        this.effort = effort;
        this.stat = stat;
    }

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public List<Stat> getStat() {
        return stat;
    }

    public void setStat(List<Stat> stat) {
        this.stat = stat;
    }
}
