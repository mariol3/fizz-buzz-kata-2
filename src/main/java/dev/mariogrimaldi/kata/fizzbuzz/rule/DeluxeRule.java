package dev.mariogrimaldi.kata.fizzbuzz.rule;

import java.util.stream.Collectors;

public class DeluxeRule implements GameRule {
    @Override
    public String applyFor(int number) {
        return isDeluxe(number) && number % 2 == 0 ? "Deluxe" : "";
    }

    private boolean isDeluxe(int number) {
        int numberOfUniqueDigits = String.valueOf(number)
                .chars()
                .boxed()
                .collect(Collectors.toSet()).size();
        return number > 10 && numberOfUniqueDigits == 1;
    }
}
