package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private List<GameRule> rules;

    public FizzBuzz(List<GameRule> rules) {
        this.rules = new ArrayList<>(rules);
    }

    public String play(int number) {
        StringBuilder result = new StringBuilder();

        rules.forEach(rule -> result.append(rule.applyTo(number)));

        return result.length() != 0 ? result.toString() : String.valueOf(number);
    }

}
