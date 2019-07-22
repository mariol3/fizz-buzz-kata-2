package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

import java.util.stream.Collectors;

public class FizzDeluxe implements GameRule {
    @Override
    public String applyFor(int number) {
        boolean containsAThree = String.valueOf(number).chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList())
                .contains('3');
        boolean divisibleByThree = number % 3 == 0;

        return divisibleByThree && containsAThree ? "FizzDeluxe" : "";
    }
}
