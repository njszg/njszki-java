package main.java;

public class Main {

    public static void main(String[] args) {
        //3. érmefeldobás szimulálás, addig megyünk, amíg tíz egymásutáni nem lesz iras
        int egymasutan = 0;
        int i;
        for(i=0;egymasutan < 10;i++) {
            double veletlen = Math.random();
            boolean iras = (veletlen > 0.5);

            if(iras){
                egymasutan++;
            } else {
                egymasutan = 0;
            }

            kiir(iras, i);
        }
        kiir("");
        kiir("Ennyi dobás kellett:");
        kiir(i);
    }

    public static void kiir(boolean b, int i) {
        System.out.print(b?'I':'F');
        if(i%5 == 4) System.out.print(" ");
        if(i%50 == 49) System.out.println("");
    }

    public static void kiir(int i) {
        System.out.println(i);
    }

    public static void kiir(String s) {
        System.out.println(s);
    }
}
