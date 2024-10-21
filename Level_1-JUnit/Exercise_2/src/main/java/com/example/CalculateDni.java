package com.example;

public class CalculateDni {

    public static char calculateDniLetter(int dni) {
        // Ensure that the DNI number is within the valid range
        if (dni < 0 || dni > 99999999) {
            throw new IllegalArgumentException("DNI number is out of range.");
        }

        // Correct letter mapping based on DNI modulo 23
        char[] letters = new char[]{
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
            'C', 'K', 'E'
        };

        // Calculate the index for the letter array using modulo
        int index = dni % 23;
        char letter = letters[index];

        System.out.println("Corresponding letter is " + letter);
        return letter;
    }
}
