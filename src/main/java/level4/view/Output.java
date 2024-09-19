package level4.view;

import java.util.Map;
import level4.domain.Hint;

public class Output {

    public static void printInstructionsMessage() {
        System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
    }

    public static void printLoadView() {
        System.out.println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
    }

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
            System.out.println("정답입니다! 다시 안내 문구를 보고 메뉴를 선택해 주세요!");
            printSpace();
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

    public static void printGameStatus(Map<Integer, Integer> attemptCounts) {
        System.out.println("< 게임 기록 보기 >");
        attemptCounts.forEach((gameNumber, attemptCount) ->
                System.out.println(gameNumber + "번째 게임 : 시도 횟수 - " + attemptCount));
        printSpace();
    }


    public static void printSpace() {
        System.out.println();
    }
}
