package dev.mariogrimaldi.kata.fizzbuzz.rule;

import dev.mariogrimaldi.kata.fizzbuzz.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class GameBuilder {
    private List<GameRule> rules = new ArrayList<>();

    public GameBuilder withRule(GameRule rule) {
        rules.add(rule);
        return this;
    }

    public FizzBuzz createGame() {
        return new FizzBuzz(rules);
    }
}
