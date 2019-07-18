package dev.mariogrimaldi.kata.fizzbuzz.rule;

import java.util.stream.Collectors;

public class BuzzDeluxe implements GameRule {
    @Override
    public String applyFor(int number) {
        boolean containsAFive = String.valueOf(number).chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList())
                .contains('5');
        boolean divisibleByFive = number % 5 == 0;

        return divisibleByFive && containsAFive ? "BuzzDeluxe" : "";
    }
}
