package br.com.isaque.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleSquareRootTest {

    @Test
    void testSquareRoot() {
        SimpleMath math = new SimpleMath(); // Definindo a instancia.
        double number = 81D;
        double expected = 9D;

        Double actual = math.squareRoot(number); // Chamar o SimpleMath, fazer uma operacao e verificar se é o que esperamos.


        assertEquals(expected, actual,  () -> "Square Root of " + number
                + " did not produce "
                + expected + "!" );
        assertNotEquals(9.2, actual, "6.2+2 did not produce 8.2");
        assertNotNull(actual);
    }
}
