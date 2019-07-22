package dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe;

public class FakeDeluxeRule extends DeluxeRuleBehaviour {

    public FakeDeluxeRule() {
        super("FakeDeluxe");
    }

    @Override
    protected boolean isApplicableTo(int number) {
        return isDeluxe(number) && isOdd(number);
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
