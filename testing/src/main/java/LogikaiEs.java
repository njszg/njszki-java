package main.java;

public class LogikaiEs implements Osszeadhato<Boolean>{

    public Boolean nulla() {
        return true;
    }

    public Boolean add(Boolean t1, Boolean t2) {
        return t1 && t2;
    }
}
