package dev.mariogrimaldi.kata.fizzbuzz.rule;

public interface GameRule {
    boolean matches(int number);
    String matchingText();
}
