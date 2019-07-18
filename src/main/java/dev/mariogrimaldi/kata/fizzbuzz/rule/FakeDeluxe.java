package dev.mariogrimaldi.kata.fizzbuzz.rule;

import java.util.stream.Collectors;

public class FakeDeluxe implements GameRule {
    @Override
    public String applyFor(int number) {
        return isDeluxe(number) && number % 2 != 0 ? "FakeDeluxe" : "";
    }

    private boolean isDeluxe(int number) {
        int numberOfUniqueDigits = String.valueOf(number)
                .chars()
                .boxed()
                .collect(Collectors.toSet()).size();
        return number > 10 && numberOfUniqueDigits == 1;
    }
}
