package com.company;


import com.company.Classes.*;
import org.apache.felix.utils.json.JSONParser;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;


public class Main {

    public static String getDataByURI(String url)
    {
        String data = "";

        InputStream is = null;

            try {
                is = new URL(url).openStream();
                try {
                    BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                    try {
                        while (rd.ready()) {
                            data += rd.readLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } finally {
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        return data;
    }

    public static void main(String[] args) throws FileNotFoundException {

        String url = "https://api.openweathermap.org/data/2.5/weather?q=Odessa&appid=dac392b2d2745b3adf08ca26054d78c4", data;
        data = getDataByURI(url);
        System.out.println(data);

        JSONParser parser = new JSONParser(data);
        //String dt = (String) parser.getParsedList().get(0);

        long dt = (long) parser.getParsed().get("dt");
        HashMap t = (HashMap) parser.getParsed().get("main");
        double temperature = (double)t.get("temp");
        Long pressure =(Long)t.get("pressure");

        // System.out.println(weather);
        t = (HashMap) parser.getParsed().get("coord");
        double lon = (double)t.get("lon");
        double lat = (double)t.get("lat");
        long visibility = (long) parser.getParsed().get("visibility");
        t = (HashMap) parser.getParsed().get("wind");
        long speed = (long)t.get("speed");
        long deg = (long)t.get("deg");
        t = (HashMap) parser.getParsed().get("clouds");
        long all =(long)t.get("all");
        String name = (String) parser.getParsed().get("name");






        Weather weather = new Weather(new MainWeather(temperature, pressure), new Coord(lon,lat), visibility, new Wind(speed, deg), new Clouds(all),dt, name) ;
        System.out.println(weather);
/*

        try {
            FileOutputStream fileOut = new FileOutputStream("./weather.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(weather);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in ./weather.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // ---------deserialize -----------
        Weather e1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("./weather.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e1 = (Weather) in.readObject();
            System.out.println(weather);

            in.close();
            fileIn.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Pirate class not found");
            c.printStackTrace();
            return;
        }

        */
    }
}
