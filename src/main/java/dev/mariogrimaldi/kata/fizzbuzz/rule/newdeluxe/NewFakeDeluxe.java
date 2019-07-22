package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

import java.util.stream.Collectors;

public class NewFakeDeluxe implements GameRule {

    private int deluxeNumber;
    private final String ruleText;

    public NewFakeDeluxe(int deluxeNumber, String ruleText) {
        this.deluxeNumber = deluxeNumber;
        this.ruleText = ruleText;
    }

    @Override
    public String applyFor(int number) {
        boolean containsDeluxeNumber = String.valueOf(number).chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList())
                .contains(Character.forDigit(deluxeNumber, 10));
        boolean divisibleByDeluxeNumber = number % deluxeNumber == 0;

        return divisibleByDeluxeNumber && containsDeluxeNumber && number % 2 != 0 ? ruleText : "";
    }

}
