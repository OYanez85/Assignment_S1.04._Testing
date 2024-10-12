import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1Test {
    @Test
    public void testIntegerEquality() {
        Integer a = 5;
        Integer b = 5;
        Integer c = 10;

        assertThat(a).isEqualTo(b); // Assert that a and b are equal
        assertThat(a).isNotEqualTo(c); // Assert that a and c are not equal
    }
}
