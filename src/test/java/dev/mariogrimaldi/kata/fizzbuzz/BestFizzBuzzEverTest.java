package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.DivisibleByRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.NewDeluxe;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.NewFakeDeluxe;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BestFizzBuzzEverTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz(Arrays.asList(
                new DivisibleByRule(3, "Fizz"),
                new DivisibleByRule(5, "Buzz"),
                new NewDeluxe(3, "Deluxe"),
                new NewDeluxe(5, "Deluxe"),
                new NewFakeDeluxe(3, "FakeDeluxe"),
                new NewFakeDeluxe(5, "FakeDeluxe")
        ));
    }

    @Test
    public void testFizzDeluxe() {
        assertEquals("FizzDeluxe", fizzBuzz.play(36));
        assertEquals("FizzDeluxe", fizzBuzz.play(234));
        assertEquals("FizzDeluxe", fizzBuzz.play(306));
    }

    @Test
    public void testFizzFakeDeluxe() {
        assertEquals("FizzFakeDeluxe", fizzBuzz.play(3));
        assertEquals("FizzFakeDeluxe", fizzBuzz.play(33));
        assertEquals("FizzFakeDeluxe", fizzBuzz.play(63));
    }

    @Test
    public void testBuzzDeluxe() {
        assertEquals("BuzzDeluxe", fizzBuzz.play(50));
    }

    @Test
    public void testBuzzFakeDeluxe() {
        assertEquals("BuzzFakeDeluxe", fizzBuzz.play(5));
        assertEquals("BuzzFakeDeluxe", fizzBuzz.play(35));
        assertEquals("BuzzFakeDeluxe", fizzBuzz.play(55));
    }

    @Test
    public void testFizzBuzzDeluxe() {
        assertEquals("FizzBuzzDeluxe", fizzBuzz.play(30));
        assertEquals("FizzBuzzDeluxe", fizzBuzz.play(150));
        assertEquals("FizzBuzzDeluxe", fizzBuzz.play(300));
    }

    @Test
    public void testFizzBuzzFakeDeluxe() {
        assertEquals("FizzBuzzFakeDeluxe", fizzBuzz.play(15));
        assertEquals("FizzBuzzFakeDeluxe", fizzBuzz.play(45));
    }

    @Test
    public void acceptanceWithRules() {
        int[] numbers = new int[]           {  1,   2,       3,            4,         5,           6,      7,   8,    9,      10,    11,    12 ,   13,   14,        15 };
        String[] expected = new String[]    { "1", "2", "FizzFakeDeluxe", "4", "BuzzFakeDeluxe", "Fizz",  "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzzFakeDeluxe" };

        String[] actual = Arrays.stream(numbers)
                .mapToObj(fizzBuzz::play)
                .toArray(String[]::new);

        assertArrayEquals(expected, actual);
    }
}
