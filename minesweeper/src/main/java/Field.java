package main.java;

public class Field {
    private boolean mine;    // akna-e
    private boolean visible; // látszik-e
    private int adjacentMineCount;
           // szomszédos aknák száma

    // konstruktor
    public Field(boolean _mine){
        mine = _mine;
        visible = false;
        adjacentMineCount = 0;
    }

    // hogyan jelenítsük meg az aknát
    public char display(){
        if(visible){
            if(mine) {
                return '@';
            } else {
                if(adjacentMineCount == 0){
                    return ' ';
                } else {
                    return (char) (adjacentMineCount+48);
                }
            }
        } else {
            return '?';
        }
    }

    // setter
    public void setAdjacentMineCount(int _adjacentMineCount) {
        adjacentMineCount = _adjacentMineCount;
    }

    // getter
    public boolean isMine() {
        return mine;
    }

    public int show() {
        if(visible){
            return -1;
        } else {
            visible = true;
            return adjacentMineCount;
        }
    }
}
