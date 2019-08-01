package dev.mariogrimaldi.kata.fizzbuzz.rule.finaldeluxe;

import java.util.stream.Collectors;

public class DeluxeBehaviour {
    private int deluxeNumber;

    public DeluxeBehaviour(int deluxeNumber) {
        this.deluxeNumber = deluxeNumber;
    }

    public boolean isDeluxe(int number) {
        return isDivisibleByDeluxeNumber(number) && containsDeluxeNumber(number);
    }

    private boolean containsDeluxeNumber(int number) {
        return String.valueOf(number).chars()
                    .mapToObj(n -> (char) n)
                    .collect(Collectors.toList())
                    .contains(Character.forDigit(deluxeNumber, 10));
    }

    private boolean isDivisibleByDeluxeNumber(int number) {
        return number % deluxeNumber == 0;
    }
}
