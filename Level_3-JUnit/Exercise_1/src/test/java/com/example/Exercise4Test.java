package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4Test {
    @Test
    public void testArrayListOrder() {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList("First", 2, 3.0));
        assertThat(list).containsExactly("First", 2, 3.0);
    }
}
