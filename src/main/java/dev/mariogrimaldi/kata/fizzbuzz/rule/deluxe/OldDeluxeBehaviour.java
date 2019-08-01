package dev.mariogrimaldi.kata.fizzbuzz.rule.deluxe;

import java.util.stream.Collectors;

public class OldDeluxeBehaviour implements DeluxeBehaviour {

    public boolean isDeluxe(int number) {
        int numberOfUniqueDigits = String.valueOf(number)
                .chars()
                .boxed()
                .collect(Collectors.toSet()).size();
        return number > 10 && numberOfUniqueDigits == 1;
    }

}
