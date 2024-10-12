package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;

public class Exercise5Test {
    @Test
    public void testMapContainsKey() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        assertThat(map).containsKey("key1");
    }
}

