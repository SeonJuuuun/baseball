package level1.exception.hint;

import level1.exception.BaseballException;

public class InvalidHintCountException extends BaseballException {

    public InvalidHintCountException(final String message) {
        super(message);
    }
}
