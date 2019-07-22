package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

public class Deluxe extends DeluxeBehaviour {

    public Deluxe(int deluxeNumber) {
        super(deluxeNumber, "Deluxe");
    }

    @Override
    protected boolean isApplicableTo(int number) {
        return isDeluxe(number) && isEven(number);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

}
