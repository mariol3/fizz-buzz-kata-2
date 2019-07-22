package dev.mariogrimaldi.kata.fizzbuzz.rule.deluxe;

public class FakeDeluxeRule extends DeluxeBehaviour {

    @Override
    public String applyFor(int number) {
        return isDeluxe(number) && number % 2 != 0 ? "FakeDeluxe" : "";
    }

}
