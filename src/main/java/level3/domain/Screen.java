package level3.domain;

import java.util.Arrays;
import level3.exception.command.InvalidCommandException;

public enum Screen {

    START("1"),
    RECORD("2"),
    EXIT("3");

    private final String command;

    Screen(final String command) {
        this.command = command;
    }

    public static Screen from(final String command) {
        return Arrays.stream(Screen.values())
                .filter(value -> value.command.equals(command))
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException("1, 2, 3 의 숫자만 입력 가능합니다."));
    }
}
