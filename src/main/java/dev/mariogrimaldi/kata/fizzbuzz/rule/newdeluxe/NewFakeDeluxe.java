package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

public class NewFakeDeluxe extends NewDeluxeBehaviour {

    public NewFakeDeluxe(int deluxeNumber) {
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
