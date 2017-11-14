import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import static java.util.Arrays.asList;
import java.util.List;


/**
 * Created by christophe on 30/10/2017.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    public void shouldReplaceDigitsWithFizzBuzz() {
        List<String> digits = asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14");
        List<String> expected = asList("1","2","fizz","4","buzz","fizz","foo","8","fizz","buzz","11","fizz","13","foo");
        assertEquals(expected, fb.replaceWithFizzBuzz(digits));
    }
}
