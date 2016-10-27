package main.java;

public class AppleTree {
    private int appleCount;

    public AppleTree(){
        appleCount = 6;
    }

    public int getAppleCount(){
        return appleCount;
    }

    public void takeOneDown(){
        appleCount--;
    }

    public void setAppleCount(int appleCount){
        this.appleCount = appleCount;
    }
}
