package main.java;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Allat> lista = new ArrayList<Allat>();

        for(int i=0; i<10; i++){
            Random r = new Random();
            int a = r.nextInt(10);
            if(a < 3){
                lista.add(new Kutya());
            } else if (a < 6){
                lista.add(new Macska());
            } else {
                lista.add(new Madar());
            }
        }

        for(Allat elem : lista){
            System.out.print(elem.hanyLabaVan());
            System.out.print(" ");
            elem.mondValamit();
        }

        Valami v = new Valami();

        tetszolegesFuggveny(v);

    }

    public static void tetszolegesFuggveny(CD val){
        val.c();
    }
}
