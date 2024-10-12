import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class Exercise4Test {
    @Test
    public void testArrayListOrder() {
        List<Object> list = new ArrayList<>();
        list.add("First");
        list.add(2);
        list.add(3.0);

        assertThat(list).containsExactly("First", 2, 3.0); // Assert order of objects as inserted

        // Verify list contains objects in any order
        assertThat(list).contains("First", 2, 3.0);
        
        // Ensure the object "First" is counted only once
        list.add("First");
        assertThat(list).hasSize(4); // Now the size should be 4 after adding "First" again

        // Verify that "NotInList" is not present
        assertThat(list).doesNotContain("NotInList");
    }
}
