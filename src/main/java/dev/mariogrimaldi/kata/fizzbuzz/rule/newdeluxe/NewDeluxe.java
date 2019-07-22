package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

public class NewDeluxe extends NewDeluxeBehaviour {

    public NewDeluxe(int deluxeNumber, String ruleText) {
        super(deluxeNumber, ruleText);
    }

    @Override
    public String applyFor(int number) {
        return isDeluxe(number) && isEven(number) ? getRuleText() : "";
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

}
