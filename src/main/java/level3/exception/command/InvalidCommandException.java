package level3.exception.command;

import level3.exception.BaseballException;

public class InvalidCommandException extends BaseballException {

    public InvalidCommandException(String message) {
        super(message);
    }
}
