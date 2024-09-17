package level1.domain;

import level1.exception.hint.InvalidHintCountException;

public class Hint {

    private static final int ZERO_COUNT = 0;

    private final int strikeCount;
    private final int ballCount;
    private final boolean isEnded;

    public Hint(final int strikeCount, final int ballCount, final boolean isEnded) {
        validateCounts(strikeCount, ballCount);
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
        this.isEnded = isEnded;
    }

    private void validateCounts(int strikeCount, int ballCount) {
        if (strikeCount < ZERO_COUNT) {
            throw new InvalidHintCountException("strikeCount는 0보다 작을 수 없습니다.");
        }
        if (ballCount < ZERO_COUNT) {
            throw new InvalidHintCountException("ballCount는 0보다 작을 수 없습니다.");
        }
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public boolean isEnded() {
        return isEnded;
    }
}
