package com.example;

public class ArrayIndexOutOfBoundsExceptionThrowing {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3};

        // This will throw ArrayIndexOutOfBoundsException
        try {
            System.out.println(numbers[5]);  // Accessing out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public void throwException() {
        int[] array = new int[5];  // Array with 5 elements
        try {
            System.out.println(array[10]);  // Accessing an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Attempted to access invalid index: " + e.getMessage());
        }
    }
}
