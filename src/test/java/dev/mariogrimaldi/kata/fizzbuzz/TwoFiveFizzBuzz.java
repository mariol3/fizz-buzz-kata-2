package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.MultiplesOfFive;
import dev.mariogrimaldi.kata.fizzbuzz.rule.MultiplesOfTwo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class TwoFiveFizzBuzz {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = fizzBuzz = new FizzBuzz(Arrays.asList(
                new MultiplesOfTwo(),
                new MultiplesOfFive()
        ));
    }

    @Test
    public void oneShouldPrintOne() {
        Assert.assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void threeShouldPrintThree() {
        Assert.assertEquals("3", fizzBuzz.play(3));
    }

    @Test
    public void sevenShouldPrintSeven() {
        Assert.assertEquals("7", fizzBuzz.play(7));
    }

    @Test
    public void twoShouldPrintFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.play(2));
    }

    @Test
    public void fourShouldPrintFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.play(4));
    }

    @Test
    public void sixShouldPrintFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.play(6));
    }

    @Test
    public void fiveShouldPrintBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    public void fifteenShouldPrintBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.play(15));
    }

    @Test
    public void twentyFiveShouldPrintBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.play(25));
    }

    @Test
    public void tenShouldPrintFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.play(10));
    }

    @Test
    public void twentyShouldPrintFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.play(20));
    }

    @Test
    public void acceptance() {
        int[] numbers = new int[]           {  1,     2,    3,    4,      5,      6,     7,     8,    9,      10,      11,    12 ,   13,    14,     15 };
        String[] expected = new String[]    { "1", "Fizz", "3", "Fizz", "Buzz", "Fizz", "7", "Fizz", "9", "FizzBuzz", "11", "Fizz", "13", "Fizz", "Buzz" };
        List<String> actual = new ArrayList<>();

        for (int number : numbers) {
            actual.add(fizzBuzz.play(number));
        }

        assertArrayEquals(expected, actual.toArray());
    }
}
