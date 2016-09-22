package test.java;

import main.java.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestMain {

    @Test
    public void testGetRandomNumber() {
        Main main = new Main();
        int returnedValue = main.getRandomNumber();
        assertEquals("Should equal", 4, returnedValue);
    }

    @Test
    public void testIsEvenEven() {
        Main main = new Main();
        boolean isEven = main.isEven(6);
        assertTrue("Should be true", isEven);
    }

    @Test
    public void testIsEvenOdd() {
        Main main = new Main();
        boolean isEven = main.isEven(5);
        assertFalse("Should be false", isEven);
    }

    @Test
    public void testSolveQuadraticNoSolution() {
        Main main = new Main();
        int[] solution = main.solveQuadratic(1, 1, 1);
        assertEquals(0, solution.length);
    }

    @Test
    public void testSolveQuadraticOneSolution() {
        Main main = new Main();
        int[] solution = main.solveQuadratic(0, 0, 0);
        assertEquals(1, solution.length);
        assertEquals(0, solution[0]);
    }

    @Test
    public void testSolveQuadraticTwoSolutions() {
        Main main = new Main();
        int[] solution = main.solveQuadratic(1, -5, 6);
        assertEquals(2, solution.length);
        assertEquals(2, solution[0]);
        assertEquals(3, solution[1]);
    }
}

