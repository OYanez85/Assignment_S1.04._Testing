import org.assertj.core.api.Assertions;

public class Exercici_3 {
    public void testArrayEquality() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 5, 6};

        Assertions.assertThat(array1).isEqualTo(array2); // Assert that array1 and array2 are identical
        Assertions.assertThat(array1).isNotEqualTo(array3); // Assert that array1 and array3 are not identical
    }
}
