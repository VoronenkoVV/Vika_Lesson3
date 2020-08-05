package com.company.Classes;

import java.io.Serializable;

public class Coord  implements Serializable {

    private Double lon;
    private Double lat;

    public Coord(double longitude, double latitude) {
        this.lat = latitude;
        this.lon = longitude;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coordinates: " + lon + ", " + lat;
    }

}
