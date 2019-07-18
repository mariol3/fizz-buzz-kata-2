package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class PuffRule implements GameRule {

    @Override
    public String applyFor(int number) {
        return number % 11 == 0 ? "Puff" : "";
    }
}
