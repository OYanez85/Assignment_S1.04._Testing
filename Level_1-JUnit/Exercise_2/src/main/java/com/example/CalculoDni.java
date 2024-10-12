package com.example;

public class CalculoDni {
    public static char calculateDniLetter(int dniNumber) {
        String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE"; // Correct DNI letters
        return dniLetters.charAt(dniNumber % 23);
    }
}
