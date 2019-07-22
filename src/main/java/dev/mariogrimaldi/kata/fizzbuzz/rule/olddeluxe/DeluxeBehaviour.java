package dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

import java.util.stream.Collectors;

public abstract class DeluxeBehaviour implements GameRule {

    protected boolean isDeluxe(int number) {
        int numberOfUniqueDigits = String.valueOf(number)
                .chars()
                .boxed()
                .collect(Collectors.toSet()).size();
        return number > 10 && numberOfUniqueDigits == 1;
    }

}
