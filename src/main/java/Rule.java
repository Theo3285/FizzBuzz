/**
 * Created by christophe on 14/11/2017.
 */
public abstract class Rule {
    private Rule nextRule;

    public void setSuccessor(Rule nextRule) {
        this.nextRule = nextRule;
    }

    public String execute(int digit) {
        if (nextRule != null) {
            return nextRule.execute(digit);
        }
        return "" + digit;
    }
}
