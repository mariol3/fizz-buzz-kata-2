package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

import java.util.stream.Collectors;

public abstract class NewDeluxeBehaviour implements GameRule {
    private int deluxeNumber;
    private final String ruleText;

    public NewDeluxeBehaviour(int deluxeNumber, String ruleText) {
        this.deluxeNumber = deluxeNumber;
        this.ruleText = ruleText;
    }

    protected int getDeluxeNumber() {
        return deluxeNumber;
    }

    protected String getRuleText() {
        return ruleText;
    }

    protected boolean isDeluxe(int number) {
        boolean containsDeluxeNumber = String.valueOf(number).chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList())
                .contains(Character.forDigit(getDeluxeNumber(), 10));

        boolean divisibleByDeluxeNumber = number % getDeluxeNumber() == 0;

        return divisibleByDeluxeNumber && containsDeluxeNumber;
    }
}
