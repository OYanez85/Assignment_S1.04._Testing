package com.example;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise5Test {

    @Test
    public void testMapContainsKey() {
        Map<String, Integer> map = Exercise5.getMap();

        // Assert the map contains the key
        assertThat(map).containsKey("key1");
    }
}
