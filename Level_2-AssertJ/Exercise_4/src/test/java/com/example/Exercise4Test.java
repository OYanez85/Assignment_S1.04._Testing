package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise4Test {

    @Test
    public void testArrayListOrderAndContent() {
        List<Object> list = Exercise4.getObjectList();

        // Assert the order of the objects
        assertThat(list).containsExactly("String", 123, true);

        // Assert the list contains the objects in any order
        assertThat(list).contains("String", 123, true);

        // Assert the list contains "String" only once
        assertThat(list).containsOnlyOnce("String");

        // Assert the list does not contain an object
        assertThat(list).doesNotContain("MissingElement");
    }
}
