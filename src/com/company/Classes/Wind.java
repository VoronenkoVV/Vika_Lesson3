package com.company.Classes;

import java.io.Serializable;

public class Wind  implements Serializable {
    public Wind(Double speed, Integer deg) {
        this.speed = speed;
        this.deg = deg;
    }

    private Double speed;
    private Integer deg;

    public Double getSpeed() {
        return speed;
    }
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }
    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Wind: " + deg + "°, speed: " + speed + " mps";
    }

}
