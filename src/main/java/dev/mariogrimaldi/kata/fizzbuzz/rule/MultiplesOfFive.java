package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class MultiplesOfFive implements GameRule {

    @Override
    public String applyFor(int number) {
        return number % 5 == 0 ? "Buzz" : "";
    }
}
