package dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe;

public class OldFakeDeluxeRule extends OldDeluxeRuleBehaviour {

    public OldFakeDeluxeRule() {
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
