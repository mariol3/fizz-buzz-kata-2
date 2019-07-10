import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoFiveFizzBuzz {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz(new TwoFiveGameRules());
    }

    @Test
    public void oneShouldPrintOne() {
        assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void threeShouldPrintThree() {
        assertEquals("3", fizzBuzz.play(3));
    }

    @Test
    public void sevenShouldPrintSeven() {
        assertEquals("7", fizzBuzz.play(7));
    }

    @Test
    public void twoShouldPrintFizz() {
        assertEquals("Fizz", fizzBuzz.play(2));
    }

    @Test
    public void fourShouldPrintFizz() {
        assertEquals("Fizz", fizzBuzz.play(4));
    }

    @Test
    public void sixShouldPrintFizz() {
        assertEquals("Fizz", fizzBuzz.play(6));
    }
}
