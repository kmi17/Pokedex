package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class VersionGroupDetail implements Serializable {
    private int level_learned_at;
    private VersionGroup version_group;
    private MoveLearnMethod move_learn_method;

    public VersionGroupDetail() {
    }

    public VersionGroupDetail(int level_learned_at, VersionGroup version_group, MoveLearnMethod move_learn_method) {
        this.level_learned_at = level_learned_at;
        this.version_group = version_group;
        this.move_learn_method = move_learn_method;
    }

    public int getLevel_learned_at() {
        return level_learned_at;
    }

    public void setLevel_learned_at(int level_learned_at) {
        this.level_learned_at = level_learned_at;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

    public MoveLearnMethod getMove_learn_method() {
        return move_learn_method;
    }

    public void setMove_learn_method(MoveLearnMethod move_learn_method) {
        this.move_learn_method = move_learn_method;
    }
}
