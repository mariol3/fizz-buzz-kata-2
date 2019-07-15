import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void oneShouldPrintOne() {
        assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void twoShouldPrintTwo() {
        assertEquals("2", fizzBuzz.play(2));
    }

    @Test
    public void fourShouldPrintFour() {
        assertEquals("4", fizzBuzz.play(4));
    }

    @Test
    public void threeShouldPrintFizz() {
        assertEquals("Fizz", fizzBuzz.play(3));
    }

    @Test
    public void sixShouldPrintFizz() {
        assertEquals("Fizz", fizzBuzz.play(6));
    }

    @Test
    public void nineShouldPrintFizz() {
        assertEquals("Fizz", fizzBuzz.play(9));
    }

    @Test
    public void fiveShouldPrintBuzz() {
        assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    public void tenShouldPrintBuzz() {
        assertEquals("Buzz", fizzBuzz.play(10));
    }

    @Test
    public void twentyShouldPrintBuzz() {
        assertEquals("Buzz", fizzBuzz.play(20));
    }

    @Test
    public void fifteenShouldPrintFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.play(15));
    }

    @Test
    public void thirtyShouldPrintFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.play(30));
    }

    @Test
    public void fourtyFiveShouldPrintFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.play(45));
    }

    @Test
    public void sevenShouldPrintBang() {
        assertEquals("Bang", fizzBuzz.play(7));
    }

    @Test
    public void fourteenShouldPrintBang() {
        assertEquals("Bang", fizzBuzz.play(14));
    }

    @Test
    public void twentyEightShouldPrintBang() {
        assertEquals("Bang", fizzBuzz.play(28));
    }

    @Test
    public void twentyOneShouldPrintFizzBang() {
        assertEquals("FizzBang", fizzBuzz.play(21));
    }

    @Test
    public void acceptance() {
        int[] numbers = new int[]           {  1,   2,    3,     4,    5,      6,      7,     8,    9,      10,    11,    12 ,   13,    14,      15 };
        String[] expected = new String[]    { "1", "2", "Fizz", "4", "Buzz", "Fizz", "Bang", "8", "Fizz", "Buzz", "11", "Fizz", "13", "Bang", "FizzBuzz" };

        // todo replace with java 8 stream
        String[] actual = Arrays.stream(numbers)
                .mapToObj(n -> fizzBuzz.play(n))
                .toArray(String[]::new);

        assertArrayEquals(expected, actual);
    }
}
