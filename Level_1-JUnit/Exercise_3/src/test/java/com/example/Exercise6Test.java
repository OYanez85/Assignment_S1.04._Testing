import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise6Test {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};

        assertThatThrownBy(() -> {
            int value = array[5]; // This will throw ArrayIndexOutOfBoundsException
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class) // Assert that the exception is thrown
          .hasMessageContaining("Index 5 out of bounds for length 3");
    }
}
