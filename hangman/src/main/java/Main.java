package main.java;

public class Main {

    public static void main(String[] args) {

	    Hangman hangman = new Hangman();

        hangman.printState();
        while(hangman.isStillInGame()) {
            hangman.guess(IO.readChar());
            hangman.printState();
        }

        if(hangman.isItAWin()){
            IO.writeln("Nyertél, gratulálok!");
        } else {
            IO.writeln("Sajnálom, felakasztódtál.");
        }
    }
}
