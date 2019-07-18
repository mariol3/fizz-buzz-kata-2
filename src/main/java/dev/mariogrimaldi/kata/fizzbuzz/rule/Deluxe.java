package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class Deluxe implements GameRule {
    @Override
    public String applyFor(int number) {
        return number == 11 || number == 22 ? "Deluxe" : "";
    }
}
