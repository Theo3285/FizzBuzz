/**
 * Created by christophe on 14/11/2017.
 */
public class FooRule extends Rule {
    @Override
    public String execute(int digit) {
        if(isFoo(digit)) {
            return "foo";
        }
        return super.execute(digit);
    }

    private boolean isFoo(int digit) {
        return digit % 7 == 0;
    }
}
