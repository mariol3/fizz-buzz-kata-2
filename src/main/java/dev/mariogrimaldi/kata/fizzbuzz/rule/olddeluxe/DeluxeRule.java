package dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe;

public class DeluxeRule extends DeluxeRuleBehaviour {

    public DeluxeRule() {
        super("Deluxe");
    }

    @Override
    protected boolean isApplicableTo(int number) {
        return isDeluxe(number) && isEven(number);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

}
