package level1.view;

import level1.domain.Hint;

public class Output {

    public static void printStartMessage() {
        System.out.println("< 게임을 시작합니다 >");
    }

    public static void requestPlayerNumber() {
        System.out.println("숫자를 입력하세요");
    }

    public static void printResult(final Hint hint) {
        final int strikeCount = hint.getStrikeCount();
        final int ballCount = hint.getBallCount();
        final boolean ended = hint.isEnded();

        if (ended) {
            System.out.println("정답입니다!");
            return;
        }

        if (strikeCount == 0 && ballCount == 0) {
            System.out.println("아웃");
            return;
        }

        StringBuilder result = new StringBuilder();
        if (strikeCount > 0) {
            result.append(strikeCount).append("스트라이크 ");
        }
        if (ballCount > 0) {
            result.append(ballCount).append("볼");
        }

        System.out.println(result.toString().trim());
    }


    public static void printSpace() {
        System.out.println();
    }
}
