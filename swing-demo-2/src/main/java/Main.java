package main.java;

/**
 * Created by Suli on 2016.12.08..
 */
public class Main {

    public static void main(String[] args) {

        MrHappyObject happy = new MrHappyObject();
        happy.addMoodListener((MoodEvent e) -> {
            System.out.print("Valami történt: ");
            System.out.println(e.mood());
        });
        happy.addMoodListener((MoodEvent e) -> {
            System.out.print("Dupla: ");
            System.out.println(e.mood());
        });

        happy.receivePinch();
        happy.receiveHug();

    }
}
