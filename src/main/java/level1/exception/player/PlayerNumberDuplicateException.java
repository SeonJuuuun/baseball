package level1.exception.player;

import level1.exception.BaseballException;

public class PlayerNumberDuplicateException extends BaseballException {

    public PlayerNumberDuplicateException(final String message) {
        super(message);
    }
}
