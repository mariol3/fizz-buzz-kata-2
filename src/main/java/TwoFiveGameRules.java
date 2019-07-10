public class TwoFiveGameRules implements GameRules {
    @Override
    public boolean isFizz(int number) {
        return number == 2;
    }

    @Override
    public boolean isBuzz(int number) {
        return false;
    }

    @Override
    public boolean isFizzBuzz(int number) {
        return false;
    }
}
