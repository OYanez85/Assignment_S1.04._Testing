package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise6Test {

    @Test
    public void testArrayIndexOutOfBoundsException() {
        // Assert the exception is thrown
        assertThatThrownBy(() -> Exercise6.throwException())
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("5");
    }
}
