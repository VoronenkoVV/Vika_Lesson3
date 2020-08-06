package com.company.Classes;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

public class Weather implements Serializable {
    public Weather(MainWeather main, Coord coord, Long visibility, Wind wind, Clouds clouds, Long dt, String name) {
        this.main = main;
        this.coord = coord;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.name = name;
    }

    public Weather() {
    }

    private MainWeather main;
    private Coord coord;
    private Long visibility;
    private Wind wind;
    private Clouds clouds;
    private Long dt;
    private String name;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public MainWeather getMainWeather() {
        return main;
    }

    public void setMainWeather(MainWeather main) {
        this.main = main;
    }

    public Long getVisibility() {
        return visibility;
    }

    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name + ": " + main + "(" + coord + ")" + wind + " " + clouds + "\n" + Date.from(Instant.ofEpochSecond(dt)).toGMTString();
    }

}
