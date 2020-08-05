package com.company.Classes;

import java.io.Serializable;

public class MainWeather implements Serializable {

    private Double temp;
    private Integer pressure;

    public MainWeather(Double temp, Integer pressure) {
        this.temp = temp;
        this.pressure = pressure;
    }
//    private Integer humidity;

    public Double getTemp() {
        return temp;
    }
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

/*    public Integer getHumidity() {
        return humidity;
    }
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }*/

    @Override
    public String toString() {
        return "Weather: " + (temp-273) + "°C, pressure: " + pressure;
    }

}
