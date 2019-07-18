package dev.mariogrimaldi.kata.fizzbuzz.rule;

import java.util.stream.Collectors;

public class Deluxe implements GameRule {
    @Override
    public String applyFor(int number) {
        int numberOfUniqueDigits = String.valueOf(number)
                .chars()
                .boxed()
                .collect(Collectors.toSet()).size();
        return (number > 10 && numberOfUniqueDigits == 1) ? "Deluxe" : "";
    }
}
