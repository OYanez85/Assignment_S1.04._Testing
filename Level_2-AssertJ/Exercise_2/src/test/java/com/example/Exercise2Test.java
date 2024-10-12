package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise2Test {

    @Test
    public void testObjectReferences() {
        Object obj1 = new Object();
        Object obj2 = obj1;

        // Assert that they are the same reference
        assertThat(obj1).isSameAs(obj2);

        // Assert that they are different references
        Object obj3 = Exercise2.getObject();
        assertThat(obj1).isNotSameAs(obj3);
    }
}
