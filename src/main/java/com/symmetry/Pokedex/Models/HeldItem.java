package com.symmetry.Pokedex.Models;

import java.io.Serializable;
import java.util.List;

public class HeldItem implements Serializable {
    private Item item;
    private List<VersionDetail> version_details;

    public HeldItem() {
    }

    public HeldItem(Item item, List<VersionDetail> version_details) {
        this.item = item;
        this.version_details = version_details;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<VersionDetail> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<VersionDetail> version_details) {
        this.version_details = version_details;
    }

}
