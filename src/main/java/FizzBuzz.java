import java.util.ArrayList;
import java.util.List;

/**
 * Created by christophe on 30/10/2017.
 */
public class FizzBuzz {

    public List<String> replaceWithFizzBuzz(List<String> digits) {

        List<String> result = new ArrayList<String>();

        Rule fizzRule = new FizzRule();
        Rule buzzRule = new BuzzRule();
        Rule fooRule = new FooRule();

        fizzRule.setSuccessor(buzzRule);
        buzzRule.setSuccessor(fooRule);

        int digit;

        for (int i = 0 ; i < digits.size() ; i++) {
            digit = getInt(digits.get(i));
            result.add(fizzRule.execute(digit));
        }
        return result;

    }

    private int getInt(String digit) {
        return Integer.parseInt(digit);
    }
}
