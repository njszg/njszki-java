package main.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ExpressionGenerator eg = new ExpressionGenerator();
        String expression = eg.getRandomExpression();
        System.out.println(expression);
        System.out.println(hideLetters(expression));


    }

    public static String hideLetters(String string) {
        String returnString = "";
        String shouldHide = "abcdefghijklmnopqrstuvwxyzáéíóöőúüűABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÖŐÚÜŰ";
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);

            if(shouldHide.indexOf(ch) > -1){
                returnString += '_';
            } else {
                returnString += ch;
            }
            returnString += ' ';
        }
        return returnString;
    }
}
