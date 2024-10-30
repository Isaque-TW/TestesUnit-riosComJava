package br.com.isaque.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleSubtractionTest {

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {
        System.out.println("Test 6.2 - 2 = 4.2");

        SimpleMath math = new SimpleMath(); // Definindo a instancia.
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber); // Chamando o método de subtração
        double expected = 4.2D;

        // Verifica se o resultado é o esperado
        assertEquals(expected, actual,  () -> firstNumber + "-" + secondNumber + " did not produce "
                + expected + "!" ); // Usamos a classe Assertion do JUnit para comparar diversas possibilidades. Verifica se o resultado da operação é verdadeiro da variavel result

        // Verifica se o resultado não é 5.2 (um valor incorreto)
        assertNotEquals(5.2, actual, "6.2-2D did not produce 4.2");

        // Verifica se o resultado não é nulo
        assertNotNull(actual);
    }
}

