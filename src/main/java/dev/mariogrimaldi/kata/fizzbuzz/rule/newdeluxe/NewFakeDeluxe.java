package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

public class NewFakeDeluxe extends NewDeluxeBehaviour {

    public NewFakeDeluxe(int deluxeNumber, String ruleText) {
        super(deluxeNumber, ruleText);
    }

    @Override
    public String applyFor(int number) {
        return isDeluxe(number) && isOdd(number) ? getRuleText() : "";
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
