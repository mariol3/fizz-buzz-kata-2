package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class MultiplesOfSeven implements GameRule {

    @Override
    public String applyFor(int number) {
        return number % 7 == 0 ? "Bang" : "";
    }
}
