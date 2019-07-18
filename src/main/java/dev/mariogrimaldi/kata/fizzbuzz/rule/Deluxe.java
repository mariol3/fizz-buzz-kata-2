package dev.mariogrimaldi.kata.fizzbuzz.rule;

import java.util.stream.Collectors;

public class Deluxe implements GameRule {
    @Override
    public String applyFor(int number) {
        if (isDeluxe(number)) {
            if (number % 2 == 0) return "Deluxe";
            else return "FakeDeluxe";
        }
        else return "";
    }

    private boolean isDeluxe(int number) {
        int numberOfUniqueDigits = String.valueOf(number)
                .chars()
                .boxed()
                .collect(Collectors.toSet()).size();
        return number > 10 && numberOfUniqueDigits == 1;
    }
}
