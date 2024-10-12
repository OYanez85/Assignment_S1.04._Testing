import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3Test {
    @Test
    public void testArrayEquality() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 5, 6};

        assertThat(array1).isEqualTo(array2); // Assert that array1 and array2 are identical
        assertThat(array1).isNotEqualTo(array3); // Assert that array1 and array3 are not identical
    }
}
