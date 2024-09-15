package level1.exception.input;

import level1.exception.BaseballException;

public class InvalidNumberException extends BaseballException {

    public InvalidNumberException(final String message) {
        super(message);
    }
}
