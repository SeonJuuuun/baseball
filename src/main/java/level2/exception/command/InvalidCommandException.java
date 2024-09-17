package level2.exception.command;

import level2.exception.BaseballException;

public class InvalidCommandException extends BaseballException {

    public InvalidCommandException(String message) {
        super(message);
    }
}
