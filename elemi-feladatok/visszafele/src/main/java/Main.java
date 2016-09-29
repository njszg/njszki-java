package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // 1. kérjünk be egy szót, és írjuk ki visszafele
        System.out.println("Írj valamit! ");

        // Console-on ez is megy
        // String szo = System.console().readLine();

        // De IntelliJ-ből csak ez
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String szo = "";
        try {
            szo = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Ez volt az: ");
        System.out.println(szo);

        String forditott = "";
        for(int i = szo.length()-1; i>=0; i--){
            forditott += szo.charAt(i);
        }

        System.out.print("Visszafele: ");
        System.out.println(forditott);
    }
}
