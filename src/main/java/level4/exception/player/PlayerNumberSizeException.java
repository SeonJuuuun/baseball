package level4.exception.player;

import level4.exception.BaseballException;

public class PlayerNumberSizeException extends BaseballException {

    public PlayerNumberSizeException() {
        super("게임 자리수에 맞게 입력해주세요!");
    }
}
