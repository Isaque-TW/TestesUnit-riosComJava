package br.com.isaque.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleDivisionTest {

    @Test
   // test[System Under Test]_[Condition or State Change]_[Expected Result]
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.0D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3D;

        assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce " + expected + "!");

        assertNotEquals(2.4D, actual, "6.0/2D did not produced 3.0D");

        assertNotNull(actual);

    }
}
