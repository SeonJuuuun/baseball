package level4.exception.player;

import level4.exception.BaseballException;

public class PlayerNumberDuplicateException extends BaseballException {

    public PlayerNumberDuplicateException(final String message) {
        super(message);
    }
}
