package level1.view;

public class Output {

    public static void printStartMessage() {
        System.out.println("< 게임을 시작합니다 >");
    }

    public static void requestPlayerNumber() {
        System.out.println("숫자를 입력하세요");
    }

    public static void printResult(final String result) {
        System.out.println(result);
    }

    public static void printAnswerMessage() {
        System.out.println("정답입니다 !");
    }

    public static void printSpace() {
        System.out.println();
    }
}
