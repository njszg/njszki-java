package test.java;

import main.java.Egesz;
import main.java.LogikaiEs;
import main.java.Szoveg;
import main.java.Tetelek;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTetelek {
    @Test
    public void testOsszegzesEgesz() {
        Integer[] input = {0, 0, 0};
        Egesz adder = new Egesz();
        Integer result = Tetelek.osszegzes(input, adder);
        assertTrue("Should equal", result.equals(0));
    }

    @Test
    public void testOsszegzesString() {
        String[] input = {"AL", "MA", "FA"};
        Szoveg adder = new Szoveg();
        String result = Tetelek.osszegzes(input, adder);
        assertTrue("Should equal", result.equals("ALMAFA"));
    }

    @Test
    public void testOsszegzesBoolean() {
        Boolean[] input = {true, true, false};
        LogikaiEs adder = new LogikaiEs();
        Boolean result = Tetelek.osszegzes(input, adder);
        assertTrue("Should equal", result.equals(false));
    }
}
