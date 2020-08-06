package com.company.Classes;

import java.io.Serializable;

public class Clouds implements Serializable {

    public Clouds(Long all) {
        this.all = all;
    }

    private Long all;

    public Long getAll() {
        return all;
    }
    public void setAll(Long all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return this.all + "%";
    }
}