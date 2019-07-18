package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz(Arrays.asList(
                new MultiplesOfThree(),
                new MultiplesOfFive(),
                new MultiplesOfSeven(),
                new MultiplesOfEleven(),
                new Deluxe()
        ));
    }

    @Test
    public void oneShouldPrintOne() {
        Assert.assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void twoShouldPrintTwo() {
        Assert.assertEquals("2", fizzBuzz.play(2));
    }

    @Test
    public void fourShouldPrintFour() {
        Assert.assertEquals("4", fizzBuzz.play(4));
    }

    @Test
    public void threeShouldPrintFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.play(3));
    }

    @Test
    public void sixShouldPrintFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.play(6));
    }

    @Test
    public void nineShouldPrintFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.play(9));
    }

    @Test
    public void fiveShouldPrintBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    public void tenShouldPrintBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.play(10));
    }

    @Test
    public void twentyShouldPrintBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.play(20));
    }

    @Test
    public void fifteenShouldPrintFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.play(15));
    }

    @Test
    public void thirtyShouldPrintFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.play(30));
    }

    @Test
    public void fourtyFiveShouldPrintFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.play(45));
    }

    @Test
    public void sevenShouldPrintBang() {
        Assert.assertEquals("Bang", fizzBuzz.play(7));
    }

    @Test
    public void fourteenShouldPrintBang() {
        Assert.assertEquals("Bang", fizzBuzz.play(14));
    }

    @Test
    public void twentyEightShouldPrintBang() {
        Assert.assertEquals("Bang", fizzBuzz.play(28));
    }

    @Test
    public void twentyOneShouldPrintFizzBang() {
        Assert.assertEquals("FizzBang", fizzBuzz.play(21));
    }

    @Test
    public void fourtyTwoShouldPrintFizzBang() {
        Assert.assertEquals("FizzBang", fizzBuzz.play(42));
    }

    @Test
    public void sixtyThreeShouldPrintFizzBang() {
        Assert.assertEquals("FizzBang", fizzBuzz.play(63));
    }

    @Test
    public void thirtyFiveShouldPrintBuzzBang() {
        Assert.assertEquals("BuzzBang", fizzBuzz.play(35));
    }

    @Test
    public void oneHundredFiveShouldPrintFizzBuzzBang() {
        Assert.assertEquals("FizzBuzzBang", fizzBuzz.play(105));
    }

    @Test
    public void twentyTwoShouldPrintPuffDeluxe() {
        Assert.assertEquals("PuffDeluxe", fizzBuzz.play(22));
    }

    @Test
    public void thirtyThreeShouldPrintFizzPuffDeluxe() {
        Assert.assertEquals("FizzPuffDeluxe", fizzBuzz.play(33));
    }

    @Test
    public void FiftyFiveShouldPrintBuzzPuffDeluxe() {
        Assert.assertEquals("BuzzPuffDeluxe", fizzBuzz.play(55));
    }

    @Test
    public void SeventyFiveShouldPrintBangPuffDeluxe() {
        Assert.assertEquals("BangPuffDeluxe", fizzBuzz.play(77));
    }

    @Test
    public void oneHundredSixtyFiveShouldPrintFizzBuzzPuff() {
        Assert.assertEquals("FizzBuzzPuff", fizzBuzz.play(165));
    }

    @Test
    public void oneThousandOneHundredFiftyFiveShouldPrintFizzBuzzBangPuff() {
        Assert.assertEquals("FizzBuzzBangPuff", fizzBuzz.play(1155));
    }

    @Test
    public void acceptanceWithRules() {
        int[] numbers = new int[]           {  1,   2,    3,     4,    5,      6,      7,     8,    9,      10,        11,    12 ,   13,    14,      15 };
        String[] expected = new String[]    { "1", "2", "Fizz", "4", "Buzz", "Fizz", "Bang", "8", "Fizz", "Buzz", "PuffDeluxe", "Fizz", "13", "Bang", "FizzBuzz" };

        String[] actual = Arrays.stream(numbers)
                .mapToObj(n -> fizzBuzz.play(n))
                .toArray(String[]::new);

        assertArrayEquals(expected, actual);
    }
}
