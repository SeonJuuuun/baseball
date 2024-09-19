package level4.exception.input;

import level4.exception.BaseballException;

public class InvalidNumberException extends BaseballException {

    public InvalidNumberException(final String message) {
        super(message);
    }
}
