import org.assertj.core.api.Assertions;
import java.util.Optional;

public class Exercici_7 {
    public void testOptionalIsEmpty() {
        Optional<String> optional = Optional.empty(); // Create an empty Optional

        Assertions.assertThat(optional).isEmpty(); // Assert that it is indeed empty
    }
}
