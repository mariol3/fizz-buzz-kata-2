public class FizzBuzz {
    private GameRules gameRules = new ClassicGameRules();

    public FizzBuzz() {
    }

    public FizzBuzz(GameRules gameRules) {
        this.gameRules = gameRules;
    }

    public String play(int number) {
        if (gameRules.isFizzBuzz(number)) return "FizzBuzz";
        else if (gameRules.isFizz(number)) return "Fizz";
        else if (gameRules.isBuzz(number)) return "Buzz";
        else return String.valueOf(number);
    }
}
