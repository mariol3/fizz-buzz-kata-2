package dev.mariogrimaldi.kata.fizzbuzz.rule.factory;

import dev.mariogrimaldi.kata.fizzbuzz.rule.DivisibleByRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;

public class ClassicFizzBuzzRuleFactory implements GameRuleAbstractFactory {
    @Override
    public GameRule fizzRule() {
        return new DivisibleByRule(3, "Fizz");
    }

    @Override
    public GameRule buzzRule() {
        return new DivisibleByRule(5, "Buzz");
    }
}
