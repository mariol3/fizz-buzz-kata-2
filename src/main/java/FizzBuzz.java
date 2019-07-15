import java.util.List;

public class FizzBuzz {
    private List<GameRule> rules;

    public FizzBuzz(List<GameRule> rules) {
        this.rules = rules;
    }

    public String play(int number) {
        StringBuilder result = new StringBuilder();

        rules.forEach(rule -> {
            if (rule.matches(number)) result.append(rule.matchingText());
        });

        return result.length() != 0 ? result.toString() : String.valueOf(number);
    }

}
