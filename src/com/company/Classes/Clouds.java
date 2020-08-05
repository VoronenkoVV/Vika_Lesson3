package com.company.Classes;

import java.io.Serializable;

public class Clouds implements Serializable {

    public Clouds(Integer all) {
        this.all = all;
    }

    private Integer all;

    public Integer getAll() {
        return all;
    }
    public void setAll(Integer all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return this.all + "%";
    }
}