package level1.exception.input;

import level1.exception.BaseballException;

public class BlankInputException extends BaseballException {

    public BlankInputException(final String message) {
        super(message);
    }
}
