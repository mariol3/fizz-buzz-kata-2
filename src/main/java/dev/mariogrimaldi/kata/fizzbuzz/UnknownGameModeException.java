package dev.mariogrimaldi.kata.fizzbuzz;

public class UnknownGameModeException extends RuntimeException {
    public UnknownGameModeException(GameFactory.GameMode gameMode) {
        super(String.format("Unknown game mode: %d", gameMode));
    }
}
