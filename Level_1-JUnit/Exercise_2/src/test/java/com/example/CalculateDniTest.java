package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateDniTest {

    @Test
    public void testDniLetterCalculation() {
        // Test for DNI 46809572, expecting letter H
        int dniNumber = 46809572;
        char expectedLetter = 'H';
        char calculatedLetter = CalculateDni.calculateDniLetter(dniNumber);

        assertEquals(expectedLetter, calculatedLetter,
            String.format("Failed for DNI number: %d", dniNumber));
    }

    @Test
    public void testInvalidDniCalculation() {
        // Test for an invalid DNI number, expecting an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateDniLetter(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateDniLetter(100000000);
        });
    }
}
