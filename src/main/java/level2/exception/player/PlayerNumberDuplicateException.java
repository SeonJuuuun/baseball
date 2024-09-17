package level2.exception.player;

import level2.exception.BaseballException;

public class PlayerNumberDuplicateException extends BaseballException {

    public PlayerNumberDuplicateException(final String message) {
        super(message);
    }
}
