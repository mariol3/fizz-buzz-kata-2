public class MultiplesOfFive implements GameRule {
    @Override
    public boolean matches(int number) {
        return number % 5 == 0;
    }

    @Override
    public String matchingText() {
        return "Buzz";
    }
}
