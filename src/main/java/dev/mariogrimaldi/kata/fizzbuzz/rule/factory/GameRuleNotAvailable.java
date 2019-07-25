package dev.mariogrimaldi.kata.fizzbuzz.rule.factory;

public class GameRuleNotAvailable extends RuntimeException {
    public GameRuleNotAvailable(String message) {
        super(message);
    }
}
