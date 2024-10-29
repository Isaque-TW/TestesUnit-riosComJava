package br.com.isaque.math;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleDivisionTest {

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstName = 6.2D;
        double secondNumber = 2D;

        Double actual = math.division(firstName, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual,
                () -> firstName + "/" + secondNumber +
                " did not produce " + expected + "!");
    }


    @Disabled("TODO: We need still work on it!")
    @Test
    @DisplayName("Test Division by Zero")
   // test[System Under Test]_[Condition or State Change]_[Expected Result]
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        fail();

    }
}
