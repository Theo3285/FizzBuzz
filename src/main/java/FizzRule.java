/**
 * Created by christophe on 14/11/2017.
 */
public class FizzRule extends Rule {
    @Override
    public String execute(int digit) {
        if(isFizz(digit)) {
            return "fizz";
        }
        return super.execute(digit);
    }

    private boolean isFizz(int digit) {
        return digit % 3 == 0;
    }
}
