package level2.domain;

public enum Screen {

    START("1"),
    RECORD("2"),
    EXIT("3");

    private final String command;

    Screen(final String command) {
        this.command = command;
    }
}
