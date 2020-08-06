package com.company.Classes;

import java.io.Serializable;

public class MainWeather implements Serializable {

    private Double temp;
    private Long pressure;

    public MainWeather(Double temp, Long pressure) {
        this.temp = temp;
        this.pressure = pressure;
    }
//    private Long humidity;

    public Double getTemp() {
        return temp;
    }
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Long getPressure() {
        return pressure;
    }
    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

/*    public Long getHumidity() {
        return humidity;
    }
    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }*/

    @Override
    public String toString() {
        return "Weather: " + String.format("value is %5.1f",temp-273) + "°C, pressure: " + pressure;
    }

}
