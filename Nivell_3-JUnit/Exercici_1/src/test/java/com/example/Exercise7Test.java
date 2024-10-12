package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

public class Exercise7Test {
    @Test
    public void testOptionalIsEmpty() {
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }
}
