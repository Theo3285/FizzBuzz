public class FizzBuzzRule extends Rule {
    @Override
    public String execute(int digit) {
        if(isFizzBuzz(digit)) {
            return "fizzbuzz";
        }
        return super.execute(digit);
    }

    private boolean isFizzBuzz(int digit) {
        return digit % 3 == 0 && digit % 5 == 0;
    }

}
