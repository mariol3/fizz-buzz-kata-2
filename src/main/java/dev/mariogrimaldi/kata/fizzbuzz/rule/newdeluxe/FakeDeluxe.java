package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

public class FakeDeluxe extends DeluxeBehaviour {

    public FakeDeluxe(int deluxeNumber) {
        super(deluxeNumber, "FakeDeluxe");
    }

    @Override
    protected boolean isApplicableTo(int number) {
        return isDeluxe(number) && isOdd(number);
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
