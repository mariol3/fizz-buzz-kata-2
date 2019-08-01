package dev.mariogrimaldi.kata.fizzbuzz.rule.finaldeluxe;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

public class DeluxeRule extends GameRule {
    private final DeluxeBehaviour deluxeBehaviour;

    public DeluxeRule(DeluxeBehaviour deluxeBehaviour) {
        super("Deluxe");
        this.deluxeBehaviour = deluxeBehaviour;
    }

    @Override
    protected boolean isApplicableTo(int number) {
        return deluxeBehaviour.isDeluxe(number) && isEven(number);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

}
