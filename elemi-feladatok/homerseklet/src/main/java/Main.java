package main.java;

public class Main {

    public static void main(String[] args) {
        //4. hőmérsékletadatokból minimum, maximum, átlag számítása

        int n = 100;
        int minRange = -30;
        int maxRange = 50;

        double[] ho = new double[n];

        for(int i=0;i<n;i++){
            ho[i] = Math.random()*(maxRange-minRange)+minRange;
        }

        double min = ho[0];
        double max = ho[0];
        double sum = ho[0];

        for(int i=0;i<n;i++){
            if(min > ho[i]) { min = ho[i]; }
            if(max < ho[i]) { max = ho[i]; }
            sum += ho[i];
        }

        double avg = sum/n;

        kiir("Min: ", min);
        kiir("Max: ", max);
        kiir("Sum: ", sum);
        kiir("Avg: ", avg);

        kiirFormazva("Min: ", min);
        kiirFormazva("Max: ", max);
        kiirFormazva("Sum: ", sum);
        kiirFormazva("Avg: ", avg);
    }

    public static void kiir(String s, double d) {
        System.out.print(s);
        System.out.println(d);
    }

    public static void kiirFormazva(String s, double d) {
        System.out.print(s);
        System.out.println(String.format("%7.2f",d));
    }
}