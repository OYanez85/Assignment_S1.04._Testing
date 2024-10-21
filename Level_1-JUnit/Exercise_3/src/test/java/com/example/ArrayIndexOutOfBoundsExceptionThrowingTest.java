package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIndexOutOfBoundsExceptionThrowingTest {

    @Test
    public void testThrowException() {
        ArrayIndexOutOfBoundsExceptionThrowing obj = new ArrayIndexOutOfBoundsExceptionThrowing();
        assertThrows(ArrayIndexOutOfBoundsException.class, obj::throwException);
    }
}
