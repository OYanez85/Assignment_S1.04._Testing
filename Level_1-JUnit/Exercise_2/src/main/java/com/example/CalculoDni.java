package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {
    
    @ParameterizedTest
    @CsvSource({
        "12345678, Z", // Example DNI numbers and expected letters
        "23456789, A",
        "34567890, B",
        "45678901, C",
        "56789012, D",
        "67890123, E",
        "78901234, F",
        "89012345, G",
        "90123456, H",
        "10234567, I"
    })
    public void testCalculateDniLetter(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, CalculoDni.calculateDniLetter(dniNumber));
    }
}
