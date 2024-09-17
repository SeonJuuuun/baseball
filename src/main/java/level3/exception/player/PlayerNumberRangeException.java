package level3.exception.player;

import level3.exception.BaseballException;

public class PlayerNumberRangeException extends BaseballException {

    public PlayerNumberRangeException(final int minRange, final int maxRange) {
        super("숫자는 " + minRange + " 에서 " + maxRange + "까지 입력할 수 있습니다.");
    }
}
