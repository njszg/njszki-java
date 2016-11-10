package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try {
            int a = beker();
            Matek.parosE(a);
        } catch (ZsoltException e) {
            System.out.println("Zsolt kivétel történt:");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ez nem fog kiíródni.");
        }

    }

    public static int beker() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String szo = "";

        try {
            szo = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int szam = Integer.parseInt(szo);

        return szam;
    }
}
