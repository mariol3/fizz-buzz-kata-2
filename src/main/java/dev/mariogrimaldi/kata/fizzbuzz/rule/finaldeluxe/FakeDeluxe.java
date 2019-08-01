package dev.mariogrimaldi.kata.fizzbuzz.rule.finaldeluxe;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

public class FakeDeluxe extends GameRule {
    private final DeluxeBehaviour deluxeBehaviour;

    public FakeDeluxe(DeluxeBehaviour deluxeBehaviour) {
        super("FakeDeluxe");
        this.deluxeBehaviour = deluxeBehaviour;
    }

    @Override
    protected boolean isApplicableTo(int number) {
        return deluxeBehaviour.isDeluxe(number) && isOdd(number);
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
