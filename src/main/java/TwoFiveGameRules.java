public class TwoFiveGameRules implements GameRules {
    @Override
    public boolean isFizz(int number) {
        return number % 2 == 0;
    }

    @Override
    public boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    @Override
    public boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    @Override
    public boolean isBang(int number) {
        return false;
    }
}
