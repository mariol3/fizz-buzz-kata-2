package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class DivisibleByRule implements GameRule {
    private final int divisor;
    private final String ruleText;

    public DivisibleByRule(int divisor, String ruleText) {
        this.ruleText = ruleText;
        this.divisor = divisor;
    }

    @Override
    public String applyFor(int number) {
        return number % divisor == 0 ? ruleText : "";
    }
}
