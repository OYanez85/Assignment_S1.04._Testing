import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

public class Exercise5Test {
    @Test
    public void testMapContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");

        assertThat(map).containsKey("Key1"); // Assert that the map contains "Key1"
    }
}
