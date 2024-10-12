import org.assertj.core.api.Assertions;

public class Exercici_6 {
    public void testArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};

        Assertions.assertThatThrownBy(() -> {
            int value = array[5]; // This will throw ArrayIndexOutOfBoundsException
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class) // Assert that the exception is thrown
          .hasMessageContaining("Index 5 out of bounds for length 3");
    }
}
