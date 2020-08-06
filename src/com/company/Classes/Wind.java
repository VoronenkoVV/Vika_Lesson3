package com.company.Classes;

import java.io.Serializable;

public class Wind  implements Serializable {
    public Wind(Long speed, Long deg) {
        this.speed = speed;
        this.deg = deg;
    }

    private Long speed;
    private Long deg;

    public Long getSpeed() {
        return speed;
    }
    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Long getDeg() {
        return deg;
    }
    public void setDeg(Long deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Wind: " + deg + "°, speed: " + speed + " mps";
    }

}
