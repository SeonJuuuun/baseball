package level3.exception.input;

import level3.exception.BaseballException;

public class InvalidNumberException extends BaseballException {

    public InvalidNumberException(final String message) {
        super(message);
    }
}
