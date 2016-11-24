package main.java;

public class Tetelek {

    public static <T> T osszegzes(T[] vekt, Osszeadhato<T> adder){
        T sum = adder.nulla();
        for(int i=0;i<vekt.length;i++){
            sum = adder.add(sum, vekt[i]);
        }
        return sum;
    }
}
