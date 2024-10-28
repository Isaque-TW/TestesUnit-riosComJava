package br.com.isaque.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMeanTest {

    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    void testMean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual,  () -> "(" + firstNumber
                + "+" + secondNumber + ")/2" + " did not produce "
                + expected + "!" );
        assertNotEquals(9.2, actual, "6.2+2 did not produce 8.2");
        assertNotNull(actual);
    }
}
