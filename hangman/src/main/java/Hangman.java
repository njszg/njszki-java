package main.java;

public class Hangman {

    String solution;
    String current;
    String unluckyLetters;
    int hiddenLetters;
    int lives;

    public Hangman(){
        ExpressionGenerator eg = new ExpressionGenerator();
        solution = eg.getRandomExpression().toUpperCase();
        hiddenLetters = 0;
        unluckyLetters = "";
        lives = 9;
        current = hideLetters(solution);
        //System.out.println(solution);
    }

    private String hideLetters(String string) {
        String returnString = "";
        String shouldHide = "abcdefghijklmnopqrstuvwxyzáéíóöőúüűABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÖŐÚÜŰ";
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);

            if(shouldHide.indexOf(ch) > -1){
                returnString += '*';
                hiddenLetters++;
            } else {
                returnString += ch;
            }
        }
        return returnString;
    }


    public int guess(char c) {
        int count = 0;
        for(int i=0;i<solution.length();i++){
            if(solution.charAt(i) == c){
                count++;
                hiddenLetters--;
                current = current.substring(0, i)+c+current.substring(i+1);
            }
        }

        if(count == 0){
            unluckyLetters += c;
            lives--;
        }

        return count;
    }

    public void printState(){
        System.out.println(current);
        System.out.println(lives+" <3, "+unluckyLetters);
        System.out.println();
    }

    public boolean isStillInGame() {
        return lives > 0
            && hiddenLetters > 0;
    }

    public boolean isItAWin() {
        return hiddenLetters == 0;
    }
}
