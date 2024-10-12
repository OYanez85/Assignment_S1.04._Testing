import org.assertj.core.api.Assertions;
import java.util.ArrayList;
import java.util.List;

public class Exercici_4 {
    public void testArrayListOrder() {
        List<Object> list = new ArrayList<>();
        list.add("First");
        list.add(2);
        list.add(3.0);

        Assertions.assertThat(list).containsExactly("First", 2, 3.0); // Assert order of objects as inserted

        // Verify list contains objects in any order
        Assertions.assertThat(list).contains("First", 2, 3.0);
        
        // Ensure one object is added only once
        list.add("First");
        Assertions.assertThat(list).hasSize(3); // Size should still be 3

        // Verify the absence of a missing object
        Assertions.assertThat(list).doesNotContain("NotInList");
    }
}
