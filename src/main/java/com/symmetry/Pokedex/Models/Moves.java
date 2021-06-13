package com.symmetry.Pokedex.Models;

import java.io.Serializable;
import java.util.List;

public class Moves implements Serializable {
    private Move move;
    private List<VersionGroupDetail> version_group_details;

    public Moves() {
    }

    public Moves(Move move, List<VersionGroupDetail> version_group_details) {
        this.move = move;
        this.version_group_details = version_group_details;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public List<VersionGroupDetail> getVersion_group_details() {
        return version_group_details;
    }

    public void setVersion_group_details(List<VersionGroupDetail> version_group_details) {
        this.version_group_details = version_group_details;
    }

}
