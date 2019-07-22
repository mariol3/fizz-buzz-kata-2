package dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe;

public class OldDeluxeRule extends OldDeluxeRuleBehaviour {

    public OldDeluxeRule() {
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
