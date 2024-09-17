package level2.domain;

public enum Screen {

    START(1, "게임 시작하기"),
    RECORD(2, "게임 기록 보기"),
    EXIT(3, "종료하기");

    private final int command;
    private final String title;

    Screen(int command, String title) {
        this.command = command;
        this.title = title;
    }
}
