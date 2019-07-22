package dev.mariogrimaldi.kata.fizzbuzz.rule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleByRuleShould {
    @Test
    public void return_the_rule_text_when_number_is_divisible_by_its_divisor() {
        DivisibleByRule rule = new DivisibleByRule(3, "Divisible");

        assertEquals("Divisible", rule.applyTo(3));
        assertEquals("Divisible", rule.applyTo(6));
        assertEquals("Divisible", rule.applyTo(9));
    }

    @Test
    public void return_an_empty_string_when_number_is_not_divisible_by_its_divisor() {
        DivisibleByRule rule = new DivisibleByRule(5, "Divisible");

        assertEquals("", rule.applyTo(3));
        assertEquals("", rule.applyTo(2));
        assertEquals("", rule.applyTo(9));
    }
}
