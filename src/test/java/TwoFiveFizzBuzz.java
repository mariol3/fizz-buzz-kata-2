import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoFiveFizzBuzz {

    @Test
    public void oneShouldPrintOne() {
        FizzBuzz fizzBuzz = new FizzBuzz(new TwoFiveGameRules());

        String fizzBuzzed = fizzBuzz.play(1);

        assertEquals("1", fizzBuzzed);
    }

    @Test
    public void twoShouldPrintFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(new TwoFiveGameRules());

        String fizzBuzzed = fizzBuzz.play(2);

        assertEquals("Fizz", fizzBuzzed);
    }

}
