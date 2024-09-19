package level4.exception.command;

import level4.exception.BaseballException;

public class InvalidCommandException extends BaseballException {

    public InvalidCommandException(String message) {
        super(message);
    }
}
