public class MultiplesOfThree implements GameRule {
    @Override
    public boolean matches(int number) {
        return number % 3 == 0;
    }

    @Override
    public String matchingText() {
        return "Fizz";
    }
}
