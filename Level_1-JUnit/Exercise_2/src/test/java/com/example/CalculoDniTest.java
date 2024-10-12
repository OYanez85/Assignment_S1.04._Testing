package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {
    @Test
    public void testDniLetterCalculation() {
        char letter1 = CalculoDni.calculateDniLetter(12345678);
        char letter2 = CalculoDni.calculateDniLetter(87654321);
        System.out.println("Letter for 12345678: " + letter1); // For debugging
        System.out.println("Letter for 87654321: " + letter2); // For debugging
        assertEquals('L', letter1); // Expected for 12345678
        assertEquals('Z', letter2); // Check if the expected value matches
    }
}
