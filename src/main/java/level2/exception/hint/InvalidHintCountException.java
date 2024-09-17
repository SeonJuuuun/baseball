package level2.exception.hint;

import level2.exception.BaseballException;

public class InvalidHintCountException extends BaseballException {

    public InvalidHintCountException(final String message) {
        super(message);
    }
}
