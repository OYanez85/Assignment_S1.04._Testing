import org.assertj.core.api.Assertions;

public class Exercici_1 {
    public void testIntegerEquality() {
        Integer a = 5;
        Integer b = 5;
        Integer c = 10;

        Assertions.assertThat(a).isEqualTo(b); // Assert that a and b are equal
        Assertions.assertThat(a).isNotEqualTo(c); // Assert that a and c are not equal
    }
}
