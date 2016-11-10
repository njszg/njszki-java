package main.java;

/**
 * Created by Suli on 2016.11.10..
 */
public class Matek {
    public static boolean parosE(int a) throws ZsoltException {
        if(a%2==0){
            throw new ZsoltException("Ez páros!");
        };

        return a%2==0;
    }
}
