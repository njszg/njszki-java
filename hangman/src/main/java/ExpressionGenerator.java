package main.java;

/**
 * Created by zsiri on 2016.10.13..
 */
public class ExpressionGenerator {

    private String[] expressionList;

    public ExpressionGenerator(){

        expressionList = new String[25];
        expressionList[0] = "Aki á-t mond, mondjon bé-t is.";
        expressionList[1] = "Ha adnak, vedd el, ha ütnek, szaladj el.";
        expressionList[2] = "Jobb adni, mint kapni.";
        expressionList[3] = "Kétszer ad, aki gyorsan ad.";
        expressionList[4] = "Amilyen az adjonisten, olyan a fogadjisten.";
        expressionList[5] = "Hátrább az agarakkal!";
        expressionList[6] = "Ki mint veti ágyát, úgy alussza álmát.";
        expressionList[7] = "Ágyúval lő verebekre.";
        expressionList[8] = "Ajándék lónak ne nézd a fogát.";
        expressionList[9] = "Ajtóstul ront be a házba.";
        expressionList[10] = "Ha kidobják az ajtón, bemegy az ablakon.";
        expressionList[11] = "Nem amint akarnánk, hanem amint lehet.";
        expressionList[12] = "Csak akasztásra való istrángot sem érdemelne.";
        expressionList[13] = "Kinek akasztófa helye, nem hal a Dunába.";
        expressionList[14] = "Akasztott ember házában kötelet emleget.";
        expressionList[15] = "Alkalom szüli a tolvajt.";
        expressionList[16] = "Felkavarta az állóvizet.";
        expressionList[17] = "Nem esik messze az alma a fájától.";
        expressionList[18] = "Amilyen az anya, olyan a leánya.";
        expressionList[19] = "Nézd meg az anyját, vedd el a lányát.";
        expressionList[20] = "Ár ellen nehéz úszni.";
        expressionList[21] = "Aki nem tud arabusul, ne beszéljen arabusul.";
        expressionList[22] = "Az arany a sárban is arany.";
        expressionList[23] = "Hallgatni arany.";
        expressionList[24] = "Nem mind arany, ami fénylik.";
    }

    public String getRandomExpression(){
        int rand = (int) Math.floor(Math.random()*25);
        return expressionList[rand];
    }

}
