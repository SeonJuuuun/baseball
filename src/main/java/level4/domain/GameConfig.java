package level4.domain;

import static level4.util.Repeat.repeat;

import level4.BaseballGame;
import level4.exception.input.InvalidDigitSizeException;
import level4.view.Input;

public class GameConfig {

    private static final int DEFAULT_DIGIT_SIZE = 3;
    private static final int MAX_DIGIT_SIZE = 5;
    private static final int MIN_DIGIT_SIZE = 3;

    private int digitSize;
    private final GameStats gameStats;

    public GameConfig() {
        this.digitSize = DEFAULT_DIGIT_SIZE;
        this.gameStats = new GameStats();
    }

    public void configureDigitSize() {
        this.digitSize = repeat(this::getInputDigitSize);
    }

    private int getInputDigitSize() {
        final int inputDigitSize = Integer.parseInt(Input.readDigitSize());
        validateDigitSize(inputDigitSize);
        return inputDigitSize;
    }

    public BaseballGame createBaseballGame() {
        return new BaseballGame(new RandomNumberGenerator(digitSize), new Referee(), gameStats, digitSize);
    }

    public GameStats getGameStats() {
        return gameStats;
    }

    private void validateDigitSize(final int digitSize) {
        if (digitSize < MIN_DIGIT_SIZE || digitSize > MAX_DIGIT_SIZE) {
            throw new InvalidDigitSizeException("자리수는 3, 4, 5 중 하나여야 합니다! 다시 입력해 주세요.");
        }
    }

    public int getDigitSize() {
        return digitSize;
    }
}
