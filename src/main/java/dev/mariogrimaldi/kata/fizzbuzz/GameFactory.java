package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.DivisibleByRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.DeluxeRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.FakeDeluxe;
import dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe.OldDeluxeRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.olddeluxe.OldFakeDeluxeRule;

import java.util.Arrays;

public class GameFactory {

    public FizzBuzz createGame(GameMode gameMode) {
        switch (gameMode) {
            case CLASSIC:
                return new FizzBuzz(Arrays.asList(
                        new DivisibleByRule(3, "Fizz"),
                        new DivisibleByRule(5, "Buzz")
                ));
            case EXTENDED:
                return new FizzBuzz(Arrays.asList(
                        new DivisibleByRule(3, "Fizz"),
                        new DivisibleByRule(5, "Buzz"),
                        new DivisibleByRule(7, "Bang"),
                        new DivisibleByRule(11, "Puff")
                ));
            case DELUXE:
                return new FizzBuzz(Arrays.asList(
                        new DivisibleByRule(3, "Fizz"),
                        new DivisibleByRule(5, "Buzz"),
                        new DivisibleByRule(7, "Bang"),
                        new DivisibleByRule(11, "Puff"),
                        new OldDeluxeRule(),
                        new OldFakeDeluxeRule()
                ));
            case BEST_EVER:
                return new FizzBuzz(Arrays.asList(
                        new DivisibleByRule(3, "Fizz"),
                        new DivisibleByRule(5, "Buzz"),
                        new DeluxeRule(3),
                        new DeluxeRule(5),
                        new FakeDeluxe(3),
                        new FakeDeluxe(5)
                ));
            default:
                throw new UnknownGameModeException(gameMode);
        }
    }

    enum GameMode {
        CLASSIC,
        EXTENDED,
        DELUXE,
        BEST_EVER
    }
}
