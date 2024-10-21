package com.example;

public class CalculateDni {

    private final static char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
                                           'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 
                                           'L', 'C', 'K', 'E'};

    public static char letterCalc(int numDni) {
        if (numDni < 0) {
            throw new IllegalArgumentException("DNI number cannot be negative.");
        }
        return letters[numDni % 23];
    }
}
