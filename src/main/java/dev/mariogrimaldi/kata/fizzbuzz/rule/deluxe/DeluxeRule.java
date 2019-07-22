package dev.mariogrimaldi.kata.fizzbuzz.rule.deluxe;

public class DeluxeRule extends DeluxeBehaviour {

    @Override
    public String applyFor(int number) {
        return isDeluxe(number) && isEven(number) ? "Deluxe" : "";
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

}
