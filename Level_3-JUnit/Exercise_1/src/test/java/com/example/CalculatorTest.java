package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
    }

    @Test
    public void testSubtraction() {
        assertThat(calculator.subtract(5, 3)).isEqualTo(2);
    }

    @Test
    public void testMultiplication() {
        assertThat(calculator.multiply(2, 3)).isEqualTo(6);
    }

    @Test
    public void testDivision() {
        assertThat(calculator.divide(6, 2)).isEqualTo(3.0);
    }

    @Test
    public void testDivisionByZero() {
        assertThatThrownBy(() -> calculator.divide(1, 0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Cannot divide by zero");
    }
}
