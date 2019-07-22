package dev.mariogrimaldi.kata.fizzbuzz.rule.deluxe;

public class FakeDeluxeRule extends DeluxeBehaviour {

    @Override
    public String applyFor(int number) {
        return isDeluxe(number) && isOdd(number) ? "FakeDeluxe" : "";
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
