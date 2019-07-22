package dev.mariogrimaldi.kata.fizzbuzz.rule;

public abstract class GameRule {
    private final static String BLANK = "";

    private final String ruleText;

    public GameRule(String ruleText) {
        this.ruleText = ruleText;
    }

    public String applyTo(int number) {
        return isApplicableTo(number) ? ruleText : BLANK;
    }

    protected abstract boolean isApplicableTo(int number);
}
