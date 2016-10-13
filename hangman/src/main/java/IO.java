package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    public static char readChar(){
        write("Adj meg egy betűt! ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String szo = "";
        try {
            szo = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(szo.length() > 0) {
            return szo.toUpperCase().charAt(0);
        } else {
            return 0x00;
        }
    }

    public static void writeln(String s) {
        System.out.println(s);
    }


    public static void write(String s) {
        System.out.print(s);
    }

    public static void write(char s) {
        System.out.print(s);
    }
}
