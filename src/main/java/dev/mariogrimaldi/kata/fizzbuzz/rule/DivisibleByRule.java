package dev.mariogrimaldi.kata.fizzbuzz.rule;

public class DivisibleByRule extends GameRule {
    private final int divisor;

    public DivisibleByRule(int divisor, String ruleText) {
        super(ruleText);
        this.divisor = divisor;
    }

    @Override
    protected boolean isApplicableTo(int number) {
        return number % divisor == 0;
    }
}
