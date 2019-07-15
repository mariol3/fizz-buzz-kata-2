public class MultiplesOfSeven implements GameRule {
    @Override
    public boolean matches(int number) {
        return number % 7 == 0;
    }

    @Override
    public String matchingText() {
        return "Bang";
    }
}
