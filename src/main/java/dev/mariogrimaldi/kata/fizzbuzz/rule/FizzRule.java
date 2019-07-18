package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class FizzRule implements GameRule {

    @Override
    public String applyFor(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }
}
