import org.assertj.core.api.Assertions;
import java.util.HashMap;
import java.util.Map;

public class Exercici_5 {
    public void testMapContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");

        Assertions.assertThat(map).containsKey("Key1"); // Assert that the map contains "Key1"
    }
}
