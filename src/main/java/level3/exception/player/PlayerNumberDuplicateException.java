package level3.exception.player;

import level3.exception.BaseballException;

public class PlayerNumberDuplicateException extends BaseballException {

    public PlayerNumberDuplicateException(final String message) {
        super(message);
    }
}
