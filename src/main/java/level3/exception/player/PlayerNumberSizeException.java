package level3.exception.player;

import level3.exception.BaseballException;

public class PlayerNumberSizeException extends BaseballException {

    public PlayerNumberSizeException(final int size) {
        super(size + "개의 숫자를 입력할 수 없습니다. 3자리를 입력해주세요.");
    }
}
