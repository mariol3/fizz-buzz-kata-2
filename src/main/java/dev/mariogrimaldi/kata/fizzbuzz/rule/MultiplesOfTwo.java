package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class MultiplesOfTwo implements GameRule {

    @Override
    public String applyFor(int number) {
        return number % 2 == 0 ? "Fizz" : "";
    }
}
