package level1.view;

import java.util.Scanner;
import level1.exception.input.BlankInputException;
import level1.exception.input.InvalidNumberException;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static String readPlayerNumber() {
        final String playerNumber = scanner.next();
        validateInputs(playerNumber);
        return playerNumber;
    }

    private static void validateInputs(final String inputs) {
        validateBlank(inputs);
        validateInteger(inputs);
    }

    private static void validateBlank(final String inputs) {
        if (inputs.isBlank()) {
            throw new BlankInputException("올바르지 않은 입력입니다.");
        }
    }

    private static Integer validateInteger(final String inputs) {
        try {
            return Integer.valueOf(inputs);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("숫자를 입력해야 합니다.");
        }
    }
}
