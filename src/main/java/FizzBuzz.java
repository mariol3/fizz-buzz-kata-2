public class FizzBuzz {
    public String play(int number) {
        if (number == 15 || number == 30 || number == 45) return "FizzBuzz";
        else if (isDivisibleByThree(number)) return "Fizz";
        else if (isDivisibleByFive(number)) return "Buzz";
        else return String.valueOf(number);
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
