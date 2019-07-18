package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BestFizzBuzzEverTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz(Arrays.asList(
            new FizzDeluxe()
        ));
    }

    @Test
    public void threeShouldPrintFizzDeluxe() {
        assertEquals("FizzDeluxe", fizzBuzz.play(3));
    }

    @Test
    public void thirtyThreeShouldPrintFizzDeluxe() {
        assertEquals("FizzDeluxe", fizzBuzz.play(33));
    }

    @Test
    public void sixtyThreeShouldPrintFizzDeluxe() {
        assertEquals("FizzDeluxe", fizzBuzz.play(63));
    }
}
