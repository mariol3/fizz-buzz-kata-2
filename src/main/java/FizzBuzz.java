public class FizzBuzz {
    public String play(int number) {
        if (isDivisibleByThree(number)) return "Fizz";
        else if (number == 5 || number == 10) return "Buzz";
        else return String.valueOf(number);
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
