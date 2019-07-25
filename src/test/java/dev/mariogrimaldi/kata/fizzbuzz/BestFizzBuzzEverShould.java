package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.DivisibleByRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.GameBuilder;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.DeluxeRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe.FakeDeluxe;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BestFizzBuzzEverShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new GameBuilder()
                .withRule(new DivisibleByRule(3, "Fizz"))
                .withRule(new DivisibleByRule(5, "Buzz"))
                .withRule(new DeluxeRule(3))
                .withRule(new DeluxeRule(5))
                .withRule(new FakeDeluxe(3))
                .withRule(new FakeDeluxe(5))
                .createGame();
    }

    @Test
    public void print_fizzdeluxe_for_36() {
        assertEquals("FizzDeluxe", fizzBuzz.play(36));
    }

    @Test
    public void print_fizzdeluxe_for_234() {
        assertEquals("FizzDeluxe", fizzBuzz.play(234));
    }

    @Test
    public void print_fizzdeluxe_for_306() {
        assertEquals("FizzDeluxe", fizzBuzz.play(306));
    }

    @Test
    public void print_fizzfakedeluxe_for_3() {
        assertEquals("FizzFakeDeluxe", fizzBuzz.play(3));
    }

    @Test
    public void print_fizzfakedeluxe_for_33() {
        assertEquals("FizzFakeDeluxe", fizzBuzz.play(33));
    }

    @Test
    public void print_fizzfakedeluxe_for_63() {
        assertEquals("FizzFakeDeluxe", fizzBuzz.play(63));
    }

    @Test
    public void print_buzzdeluxe_for_50() {
        assertEquals("BuzzDeluxe", fizzBuzz.play(50));
    }

    @Test
    public void print_buzzfakedeluxe_for_5() {
        assertEquals("BuzzFakeDeluxe", fizzBuzz.play(5));
    }

    @Test
    public void print_buzzfakedeluxe_for_35() {
        assertEquals("BuzzFakeDeluxe", fizzBuzz.play(35));
    }

    @Test
    public void print_buzzfakedeluxe_for_55() {
        assertEquals("BuzzFakeDeluxe", fizzBuzz.play(55));
    }

    @Test
    public void print_fizzbuzzdeluxe_for_30() {
        assertEquals("FizzBuzzDeluxe", fizzBuzz.play(30));
    }

    @Test
    public void print_fizzbuzzdeluxe_for_150() {
        assertEquals("FizzBuzzDeluxe", fizzBuzz.play(150));
    }

    @Test
    public void print_fizzbuzzdeluxe_for_300() {
        assertEquals("FizzBuzzDeluxe", fizzBuzz.play(300));
    }

    @Test
    public void print_fizzbuzzfakedeluxe_for_15() {
        assertEquals("FizzBuzzFakeDeluxe", fizzBuzz.play(15));
    }

    @Test
    public void print_fizzbuzzfakedeluxe_for_45() {
        assertEquals("FizzBuzzFakeDeluxe", fizzBuzz.play(45));
    }

    @Test
    public void print_from_1_to_15() {
        int[] numbers = new int[]           {  1,   2,         3,          4,         5,           6,      7,   8,    9,      10,    11,    12 ,   13,   14,        15 };
        String[] expected = new String[]    { "1", "2", "FizzFakeDeluxe", "4", "BuzzFakeDeluxe", "Fizz",  "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzzFakeDeluxe" };

        String[] actual = Arrays.stream(numbers)
                .mapToObj(fizzBuzz::play)
                .toArray(String[]::new);

        assertArrayEquals(expected, actual);
    }
}
