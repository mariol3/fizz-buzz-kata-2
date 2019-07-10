public class ClassicGameRules implements GameRules {
    public boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    @Override
    public boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }
}
