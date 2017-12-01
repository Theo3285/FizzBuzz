import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import static java.util.Arrays.asList;
import java.util.List;


/**
 * Created by christophe on 30/10/2017.
 */
public class FizzBuzzShouldReplace {

    private FizzBuzz fb;

    @Before
    public void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    public void aListofDigits() {
        List<String> digits = asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");
        List<String> expected = asList("1","2","fizz","4","buzz","fizz","foo","8","fizz","buzz","11","fizz","13","foo","fizzbuzz");
        assertEquals(expected, fb.replace(digits));
    }

    @Test
    public void threeWithFizz() {
        List<String> three = asList(("3"));
        List<String> expected = asList("fizz");
        assertEquals(expected, fb.replace(three));
    }

    @Test
    public void fiveWithBuzz() {
        List<String> five = asList(("5"));
        List<String> expected = asList("buzz");
        assertEquals(expected, fb.replace(five));
    }

    @Test
    public void sevenWithFoo() {
        List<String> seven = asList(("7"));
        List<String> expected = asList("foo");
        assertEquals(expected, fb.replace(seven));
    }

    @Test
    public void fifteenWithFizzBuzz() {
        List<String> digits = asList(("15"));
        List<String> expected = asList("fizzbuzz");
        assertEquals(expected, fb.replace(digits));
    }
}
