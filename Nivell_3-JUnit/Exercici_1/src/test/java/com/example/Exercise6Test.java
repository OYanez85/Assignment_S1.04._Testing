package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise6Test {
    @Test
    public void testArrayIndexOutOfBounds() {
        assertThatThrownBy(() -> {
            int[] array = new int[3];
            int value = array[5]; // This will throw an ArrayIndexOutOfBoundsException
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
