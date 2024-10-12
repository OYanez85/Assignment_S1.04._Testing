package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3Test {

    @Test
    public void testArrayEquality() {
        int[] array1 = Exercise3.getArray();
        int[] array2 = {1, 2, 3};

        // Assert arrays are identical
        assertThat(array1).isEqualTo(array2);
    }
}
