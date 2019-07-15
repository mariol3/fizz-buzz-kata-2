package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class MultiplesOfTwo implements GameRule {
    @Override
    public boolean matches(int number) {
        return number % 2 == 0;
    }

    @Override
    public String matchingText() {
        return "Fizz";
    }
}
