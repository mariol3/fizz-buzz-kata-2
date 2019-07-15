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
        if (gameRules.isFizzBuzz(number)) return "FizzBuzz";
        else if (gameRules.isFizz(number)) return "Fizz";
        else if (gameRules.isBuzz(number)) return "Buzz";
        else if (gameRules.isBang(number)) return "Bang";
        else return String.valueOf(number);
    }

}
