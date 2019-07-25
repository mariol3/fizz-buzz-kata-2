package dev.mariogrimaldi.kata.fizzbuzz;

import dev.mariogrimaldi.kata.fizzbuzz.rule.DivisibleByRule;
import dev.mariogrimaldi.kata.fizzbuzz.rule.factory.ExtendedFizzBuzzRuleFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzPuffBangShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        ExtendedFizzBuzzRuleFactory rulesFactory = new ExtendedFizzBuzzRuleFactory();
        fizzBuzz = new FizzBuzz(Arrays.asList(
                rulesFactory.fizzRule(),
                rulesFactory.buzzRule(),
                rulesFactory.bangRule(),
                rulesFactory.puffRule()
        ));
    }

    @Test
    public void print_one_for_1() {
        assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void print_two_for_2() {
        assertEquals("2", fizzBuzz.play(2));
    }

    @Test
    public void print_four_for_4() {
        assertEquals("4", fizzBuzz.play(4));
    }

    @Test
    public void print_fizz_for_3() {
        assertEquals("Fizz", fizzBuzz.play(3));
    }

    @Test
    public void print_fizz_for_6() {
        assertEquals("Fizz", fizzBuzz.play(6));
    }

    @Test
    public void print_fizz_for_9() {
        assertEquals("Fizz", fizzBuzz.play(9));
    }

    @Test
    public void print_buzz_for_5() {
        assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    public void print_buzz_for_10() {
        assertEquals("Buzz", fizzBuzz.play(10));
    }

    @Test
    public void print_buzz_for_20() {
        assertEquals("Buzz", fizzBuzz.play(20));
    }

    @Test
    public void print_fizzbuzz_for_15() {
        assertEquals("FizzBuzz", fizzBuzz.play(15));
    }

    @Test
    public void print_fizzbuzz_for_30() {
        assertEquals("FizzBuzz", fizzBuzz.play(30));
    }

    @Test
    public void print_fizzbuzz_for_45() {
        assertEquals("FizzBuzz", fizzBuzz.play(45));
    }

    @Test
    public void print_bang_for_7() {
        assertEquals("Bang", fizzBuzz.play(7));
    }

    @Test
    public void print_bang_for_14() {
        assertEquals("Bang", fizzBuzz.play(14));
    }

    @Test
    public void print_bang_for_28() {
        assertEquals("Bang", fizzBuzz.play(28));
    }

    @Test
    public void print_fizzbang_for_21() {
        assertEquals("FizzBang", fizzBuzz.play(21));
    }

    @Test
    public void print_fizzbang_for_42() {
        assertEquals("FizzBang", fizzBuzz.play(42));
    }

    @Test
    public void print_fizzbang_for_63() {
        assertEquals("FizzBang", fizzBuzz.play(63));
    }

    @Test
    public void print_buzzbang_for_35() {
        assertEquals("BuzzBang", fizzBuzz.play(35));
    }

    @Test
    public void print_fizzbuzzbang_for_105() {
        assertEquals("FizzBuzzBang", fizzBuzz.play(105));
    }


    @Test
    public void print_fizzbuzzpuff_for_165() {
        assertEquals("FizzBuzzPuff", fizzBuzz.play(165));
    }

    @Test
    public void print_fizzbuzzbangpuff_for_1155() {
        assertEquals("FizzBuzzBangPuff", fizzBuzz.play(1155));
    }

    @Test
    public void print_from_1_to_15() {
        int[] numbers = new int[]           {  1,   2,    3,     4,    5,      6,      7,     8,    9,      10,     11,    12 ,   13,    14,      15 };
        String[] expected = new String[]    { "1", "2", "Fizz", "4", "Buzz", "Fizz", "Bang", "8", "Fizz", "Buzz", "Puff", "Fizz", "13", "Bang", "FizzBuzz" };

        String[] actual = Arrays.stream(numbers)
                .mapToObj(fizzBuzz::play)
                .toArray(String[]::new);

        assertArrayEquals(expected, actual);
    }
}
