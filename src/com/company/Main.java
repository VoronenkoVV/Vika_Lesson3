package com.company;

import com.company.Classes.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Weather weather = new Weather(new MainWeather(30.0, 760), new Coord(38,42), 1000, new Wind(10.0, 90), new Clouds(50),1460698741, "Odessa") ;
        System.out.println(weather);


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

    }
}
