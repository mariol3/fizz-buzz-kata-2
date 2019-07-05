import org.junit.Test;

import java.applet.AudioClip;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void oneShouldPrintOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String fizzBuzzed = fizzBuzz.play(1);

        assertEquals("1", fizzBuzzed);
    }

    @Test
    public void name() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String fizzBuzzed = fizzBuzz.play(2);

        assertEquals("2", fizzBuzzed);
    }
}
