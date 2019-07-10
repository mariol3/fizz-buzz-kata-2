import org.junit.Before;
import org.junit.Test;

import java.applet.AudioClip;

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
}
