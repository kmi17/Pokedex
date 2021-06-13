package com.symmetry.Pokedex.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Other implements Serializable {
        private DreamWorld dream_world;
        @JsonProperty("official-artwork")
        private OfficialArtwork officialArtwork;

        public Other() {
        }

        public Other(DreamWorld dream_world, OfficialArtwork officialArtwork) {
                this.dream_world = dream_world;
                this.officialArtwork = officialArtwork;
        }

        public DreamWorld getDream_world() {
                return dream_world;
        }

        public void setDream_world(DreamWorld dream_world) {
                this.dream_world = dream_world;
        }

        public OfficialArtwork getOfficialArtwork() {
                return officialArtwork;
        }

        public void setOfficialArtwork(OfficialArtwork officialArtwork) {
                this.officialArtwork = officialArtwork;
        }

}
