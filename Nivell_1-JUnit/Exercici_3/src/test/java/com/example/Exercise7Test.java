import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

public class Exercise7Test {
    @Test
    public void testOptionalIsEmpty() {
        Optional<String> optional = Optional.empty(); // Create an empty Optional

        assertThat(optional).isEmpty(); // Assert that it is indeed empty
    }
}
