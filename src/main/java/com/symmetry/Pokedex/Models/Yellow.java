package com.symmetry.Pokedex.Models;

import java.io.Serializable;

public class Yellow implements Serializable {
    private String back_default;
    private String back_gray;
    private String front_default;
    private String front_gray;

    public Yellow() {
    }

    public Yellow(String back_default, String back_gray, String front_default, String front_gray) {
        this.back_default = back_default;
        this.back_gray = back_gray;
        this.front_default = front_default;
        this.front_gray = front_gray;
    }

    public String getBack_default() {
        return back_default;
    }

    public void setBack_default(String back_default) {
        this.back_default = back_default;
    }

    public String getBack_gray() {
        return back_gray;
    }

    public void setBack_gray(String back_gray) {
        this.back_gray = back_gray;
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    public String getFront_gray() {
        return front_gray;
    }

    public void setFront_gray(String front_gray) {
        this.front_gray = front_gray;
    }
}
