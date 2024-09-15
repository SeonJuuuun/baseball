package level1.exception;

public class BaseballException extends RuntimeException {

    public BaseballException(final String message) {
        super("[ERROR] " + message);
    }
}
