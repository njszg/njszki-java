package main.java;

public class Main {

    public static void main(String[] args) {
        AppleTree appleTree = new AppleTree();
        System.out.println(appleTree.getAppleCount());
        appleTree.takeOneDown();
        appleTree.takeOneDown();
        System.out.println(appleTree.getAppleCount());

        AppleTree anotherAppleTree = new AppleTree();
        System.out.println(anotherAppleTree.getAppleCount());
    }
}
