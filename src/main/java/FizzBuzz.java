public class FizzBuzz {
    private GameRules gameRules = new ClassicGameRules();

    public FizzBuzz() {
    }

    public FizzBuzz(GameRules gameRules) {
        this.gameRules = gameRules;
    }

    // todo add bang for multiples of 7
    // todo add puff for multiples of 11
    public String play(int number) {
        StringBuilder result = new StringBuilder();

        if (gameRules.isFizz(number)) {
            result.append("Fizz");
        }
        if (gameRules.isBuzz(number)) {
            result.append("Buzz");
        }
        if (gameRules.isBang(number)) {
            result.append("Bang");
        }
        if (result.length() == 0) {
            result.append(number);
        }

        return result.toString();
    }

}
