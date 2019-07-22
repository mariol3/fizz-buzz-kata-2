package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

import java.util.stream.Collectors;

public abstract class NewDeluxeBehaviour extends GameRule {
    private int deluxeNumber;

    public NewDeluxeBehaviour(int deluxeNumber, String ruleText) {
        super(ruleText);
        this.deluxeNumber = deluxeNumber;
    }

    protected boolean isDeluxe(int number) {
        return isDivisibleByDeluxeNumber(number) && containsDeluxeNumber(number);
    }

    private boolean containsDeluxeNumber(int number) {
        return String.valueOf(number).chars()
                    .mapToObj(n -> (char) n)
                    .collect(Collectors.toList())
                    .contains(Character.forDigit(deluxeNumber, 10));
    }

    private boolean isDivisibleByDeluxeNumber(int number) {
        return number % deluxeNumber == 0;
    }
}
