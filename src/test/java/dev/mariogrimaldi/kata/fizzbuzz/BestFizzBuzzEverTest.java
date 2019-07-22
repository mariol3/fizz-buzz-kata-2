package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.BuzzDeluxe;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.FizzDeluxe;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.NewDeluxe;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BestFizzBuzzEverTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz(Arrays.asList(
                new NewDeluxe(3, "FizzDeluxe"),
                new NewDeluxe(5, "BuzzDeluxe")
        ));
    }

    @Test
    public void testFizzDeluxe() {
        assertEquals("FizzDeluxe", fizzBuzz.play(3));
        assertEquals("FizzDeluxe", fizzBuzz.play(33));
        assertEquals("FizzDeluxe", fizzBuzz.play(63));
    }

    @Test
    public void testBuzzDeluxe() {
        assertEquals("BuzzDeluxe", fizzBuzz.play(5));
        assertEquals("BuzzDeluxe", fizzBuzz.play(15));
        assertEquals("BuzzDeluxe", fizzBuzz.play(55));
    }
}
