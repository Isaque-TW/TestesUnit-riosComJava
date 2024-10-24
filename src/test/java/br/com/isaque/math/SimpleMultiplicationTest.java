package br.com.isaque.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMultiplicationTest {

    @Test
    void testMultiplication(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual, () -> firstNumber
                + "*" + secondNumber
                + " did not produce"
                + expected + "!" );
        assertNotEquals(5.3, actual, "6.2*2D did not produced 12.4");
        assertNotNull(actual);
    }
}