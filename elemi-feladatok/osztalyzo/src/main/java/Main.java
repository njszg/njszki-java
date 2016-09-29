package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        kiir("Mennyi a maxpont?");
        int maxPont = beker();
        //kiir(Integer.toString(maxPont));
        //kiir(String.valueOf(maxPont));
        kiir("Maxpont:");
        kiir(maxPont);

        while(hallgatoBeker(maxPont)) {}
    }

    public static boolean hallgatoBeker(int maxPont) {
        kiir("Hány pontot írt a hallgató?");
        int pont = beker();

        // nem valós program, kilépünk
        if (pont < 0) return false;

        int szazalek = pont * 100 / maxPont;
        kiir("Százalék:");
        kiir(szazalek);

        kiir("Jegy:");

        String ertekeles;
        if (szazalek > 87) {
            ertekeles = "Jeles (5)";
        } else if (szazalek > 75) {
            ertekeles = "Jó (4)";
        } else if (szazalek > 63) {
            ertekeles = "Közepes (3)";
        } else if (szazalek > 50) {
            ertekeles = "Elégséges (2)";
        } else {
            ertekeles = "Elégtelen (1)";
        }
        kiir(ertekeles);

        return true;
    }

    public static int beker(){
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

    public static void kiir(String s) {
        System.out.println(s);
    }

    public static void kiir(int i) {
        System.out.println(i);
    }
}
