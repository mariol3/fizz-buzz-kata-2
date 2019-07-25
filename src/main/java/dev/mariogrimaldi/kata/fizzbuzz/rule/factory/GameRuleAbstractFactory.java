package dev.mariogrimaldi.kata.fizzbuzz.rule.factory;

import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

public interface GameRuleAbstractFactory {
    default GameRule fizzRule() {
        throw new GameRuleNotAvailable("Fizz rule not available in this game.");
    }

    default GameRule buzzRule() {
        throw new GameRuleNotAvailable("Fizz rule not available in this game.");
    }

    default GameRule bangRule() {
        throw new GameRuleNotAvailable("Fizz rule not available in this game.");
    }

    default GameRule puffRule() {
        throw new GameRuleNotAvailable("Fizz rule not available in this game.");
    }

    default GameRule deluxeRule() {
        throw new GameRuleNotAvailable("Fizz rule not available in this game.");
    }

    default GameRule fakeDeluxeRule() {
        throw new GameRuleNotAvailable("Fizz rule not available in this game.");
    }
}
