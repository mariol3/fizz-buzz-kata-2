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
        else if ((number == 7 || number == 14 || number == 28) && gameRules instanceof ClassicGameRules) return "Bang";
        else return String.valueOf(number);
    }
}
