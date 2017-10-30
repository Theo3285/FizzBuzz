import java.util.ArrayList;
import java.util.List;

/**
 * Created by christophe on 30/10/2017.
 */
public class FizzBuzz {

    public List<String> replaceWithFizzBuzz(List<String> digits) {
        List<String> result = new ArrayList<String>();
        int digit;
        for (int i = 0 ; i < digits.size() ; i++) {
            digit = getInt(digits.get(i));
            if (isFizz(digit)) {
                result.add("fizz");
            } else if (isBuzz(digit)) {
                result.add("buzz");
            } else {
                digit = i + 1;
                result.add(String.valueOf(digit));
            }
        }
        return result;
    }

    private boolean isFizz(int digit) {
        return digit % 3 == 0;
    }

    private boolean isBuzz(int digit) {
        return digit % 5 == 0;
    }

    private int getInt(String digit) {
        return Integer.parseInt(digit);
    }
}
