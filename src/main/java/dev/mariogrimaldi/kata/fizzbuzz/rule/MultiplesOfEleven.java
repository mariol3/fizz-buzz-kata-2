package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class MultiplesOfEleven implements GameRule {
    @Override
    public boolean matches(int number) {
        return number % 11 == 0;
    }

    @Override
    public String matchingText() {
        return "Puff";
    }
}
