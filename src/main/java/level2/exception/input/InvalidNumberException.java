package level2.exception.input;

import level2.exception.BaseballException;

public class InvalidNumberException extends BaseballException {

    public InvalidNumberException(final String message) {
        super(message);
    }
}
