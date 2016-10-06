package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int size = 9;

    public static void main(String[] args) {

        Field[][] table = new Field[size+2][size+2];
        createTable(table);
        countAdjacent(table);
        printTable(table);

        boolean isStillAlive = true;
        while(isStillAlive) {
            int x = readCoordinate('X');
            int y = readCoordinate('Y');

            if (x < 1 || y < 1 || x > size || y > size) {
                System.out.print("Hibás koordináta!");
            } else {
                isStillAlive = showField(table, x, y);
            }

            printTable(table);
        }

        //játék végén, a ciklus után
        System.out.println("Vesztettél");

    }

    private static int readCoordinate(char coordinate) {
        System.out.print("Melyik "+coordinate+" koordinátát feded fel? ");
        return readNumber();
    }

    private static boolean showField(Field[][] table, int x, int y){
        boolean isStillAlive = true;
        int adj = table[x][y].show();
        // aknát fedtünk fel
        if(table[x][y].isMine()){
            // játék vége
            showTable(table);
            isStillAlive = false;
        }

        // üreset fedünk fel
        if(adj == 0){
            // fedje fel a szomszedokat is
            if(x > 0 && y > 0 && x < size+1 && y < size+1){
                showField(table, x-1, y-1);
                showField(table, x-1, y  );
                showField(table, x-1, y+1);

                showField(table, x  , y-1);
                showField(table, x  , y+1);

                showField(table, x+1, y-1);
                showField(table, x+1, y  );
                showField(table, x+1, y+1);
            }
        }

        return isStillAlive;
    }

    // beolvasás
    private static int readNumber(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String szo = "";
        try {
            szo = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(szo);
    }

    // kiírás
    private static void printTable(Field[][] table) {
        System.out.println("     y y y y y y y y y");
        System.out.println("     1 2 3 4 5 6 7 8 9");
        System.out.println("     = = = = = = = = =");
        for(int i=1;i<size+1;i++){
            System.out.print("x");
            System.out.print(i);
            System.out.print(" = ");
            for(int j=1;j<size+1;j++){
                System.out.print(table[i][j].display());
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // megszámolni, hogy hány akna van a szomszédságban
    private static void countAdjacent(Field[][] table) {
        for(int i=1;i<size+1;i++) {
            for (int j = 1; j < size + 1; j++) {
                int count = 0;
                if(table[i-1][j-1].isMine()) { count++; }
                if(table[i-1][j  ].isMine()) { count++; }
                if(table[i-1][j+1].isMine()) { count++; }

                if(table[i  ][j-1].isMine()) { count++; }
                if(table[i  ][j+1].isMine()) { count++; }

                if(table[i+1][j-1].isMine()) { count++; }
                if(table[i+1][j  ].isMine()) { count++; }
                if(table[i+1][j+1].isMine()) { count++; }

                table[i][j].setAdjacentMineCount(count);
            }
        }
    }

    // létrehozása az objektumoknak a mátrixnak
    private static void createTable(Field[][] table) {
        for(int i=0;i<size+2;i++){
            for(int j=0;j<size+2;j++){
                table[i][j] = new Field(decideIfMine(i, j));
            }
        }
    }

    // egész tábla felfedezi
    private static void showTable(Field[][] table) {
        for(int i=1;i<size+1;i++){
            for(int j=1;j<size+1;j++){
                table[i][j].show();
            }
        }
    }

    //eldönti, hogy az (i, j) koordinátán legyen-e akna vagy sem
    public static boolean decideIfMine(int i, int j){
        if(i == 0 || j == 0 || i == size+1 || j == size+1){
            return false;
        } else {
            return Math.random()<0.1;
        }
    }
}
