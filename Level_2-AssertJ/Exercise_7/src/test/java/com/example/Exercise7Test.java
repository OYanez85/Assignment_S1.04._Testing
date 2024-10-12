package com.example;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise7Test {

    @Test
    public void testOptionalIsEmpty() {
        Optional<String> optional = Exercise7.getOptional();

        // Assert the optional is empty
        assertThat(optional).isEmpty();
    }
}
