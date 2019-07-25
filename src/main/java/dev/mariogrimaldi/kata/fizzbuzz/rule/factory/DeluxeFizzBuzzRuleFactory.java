package dev.mariogrimaldi.kata.fizzbuzz.rule.factory;

import dev.mariogrimaldi.kata.fizzbuzz.rule.DivisibleByRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.GameRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe.OldDeluxeRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe.OldFakeDeluxeRule;

public class DeluxeFizzBuzzRuleFactory implements GameRuleAbstractFactory {
    @Override
    public GameRule fizzRule() {
        return new DivisibleByRule(3, "Fizz");
    }

    @Override
    public GameRule buzzRule() {
        return new DivisibleByRule(5, "Buzz");
    }

    @Override
    public GameRule bangRule() {
        return new DivisibleByRule(7, "Bang");
    }

    @Override
    public GameRule puffRule() {
        return new DivisibleByRule(11, "Puff");
    }

    @Override
    public GameRule deluxeRule() {
        return new OldDeluxeRule();
    }

    @Override
    public GameRule fakeDeluxeRule() {
        return new OldFakeDeluxeRule();
    }
}
