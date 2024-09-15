package level1.domain;

public class Hint {

    private static final int ZERO_COUNT = 0;
    private static final int THREE_COUNT = 3;

    private final int strikeCount;
    private final int ballCount;

    public Hint(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public String result() {
        if (strikeCount == ZERO_COUNT && ballCount == ZERO_COUNT) {
            return "아웃";
        }
        if (strikeCount == ZERO_COUNT) {
            return ballCount + "볼";
        }
        if (ballCount == ZERO_COUNT) {
            return strikeCount + "스트라이크";
        }
        return strikeCount + "스트라이크 " + ballCount + "볼";
    }

    public boolean isThreeStrike() {
        return strikeCount == THREE_COUNT;
    }
}
