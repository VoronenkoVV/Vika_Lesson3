package com.company.Classes;

import com.company.Classes.Clouds;
import com.company.Classes.Coord;
import com.company.Classes.MainWeather;
import com.company.Classes.Wind;

import java.io.Serializable;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Weather implements Serializable {
    public Weather(MainWeather main, Coord coord, Integer visibility, Wind wind, Clouds clouds, Integer dt, String name) {
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
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Integer dt;
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

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
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

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
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
