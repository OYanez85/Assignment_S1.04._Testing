import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise2Test {
    @Test
    public void testObjectReference() {
        String str1 = new String("Hello");
        String str2 = str1; // Same reference
        String str3 = new String("Hello"); // Different reference

        assertThat(str1).isSameAs(str2); // Assert that str1 and str2 refer to the same object
        assertThat(str1).isNotSameAs(str3); // Assert that str1 and str3 do not refer to the same object
    }
}
