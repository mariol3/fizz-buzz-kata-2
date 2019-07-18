package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class MultiplesOfThree implements GameRule {

    @Override
    public String applyFor(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }
}
