package dev.mariogrimaldi.kata.fizzbuzz.rule.newdeluxe;

public class NewDeluxe extends NewDeluxeBehaviour {

    public NewDeluxe(int deluxeNumber) {
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
