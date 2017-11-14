/**
 * Created by christophe on 14/11/2017.
 */
public class BuzzRule extends Rule {
    @Override
    public String execute(int digit) {
        if(isBuzz(digit)) {
            return "buzz";
        }
        return super.execute(digit);
    }

    private boolean isBuzz(int digit) {
        return digit % 5 == 0;
    }
}
