package br.com.isaque.math;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath(); // Definindo a instancia.
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber); // Chamar o SimpleMath, fazer uma operacao e verificar se é o que esperamos.
        double expected = 8.2D;

        assertEquals(expected, actual,  () -> firstNumber
                + "+" + secondNumber + " did not produce "
                + expected + "!" ); // Usamos a classe Assertion do JUnit para comparar diversas possibilidades. Verifica se o resultado da operação é verdadeiro da variavel result
        assertNotEquals(9.2, actual, "6.2+2 did not produce 8.2");
        assertNotNull(actual);
    }
}
