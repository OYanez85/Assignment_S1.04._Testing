package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1Test {

    @Test
    public void testIntegerEquality() {
        Integer num1 = Exercise1.getNumber();
        Integer num2 = 10;

        // Assert equality
        assertThat(num1).isEqualTo(num2);

        // Assert inequality
        Integer num3 = 5;
        assertThat(num1).isNotEqualTo(num3);
    }
}
