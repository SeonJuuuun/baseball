package level1;

import java.util.Arrays;
import java.util.function.Supplier;
import level1.domain.Computer;
import level1.domain.Hint;
import level1.domain.NumberGenerator;
import level1.domain.Player;
import level1.domain.Referee;
import level1.exception.BaseballException;
import level1.view.Input;
import level1.view.Output;

public class BaseballGame {

    private final NumberGenerator numberGenerator;
    private final Referee referee;

    public BaseballGame(final NumberGenerator numberGenerator, final Referee referee) {
        this.numberGenerator = numberGenerator;
        this.referee = referee;
    }

    public void start() {
        Output.printStartMessage();
        final Computer computer = settingComputerNumber();
        play(computer);
    }

    private void play(final Computer computer) {
        while (true) {
            final Player player = repeat(this::inputPlayerNumber);
            final Hint hint = referee.judge(computer, player);
            Output.printResult(hint.result());
            if (hint.isThreeStrike()) {
                Output.printAnswerMessage();
                break;
            }
            Output.printSpace();
        }
    }

    private Computer settingComputerNumber() {
        return new Computer(numberGenerator);
    }

    private Player inputPlayerNumber() {
        Output.requestPlayerNumber();
        final String playerNumber = Input.readPlayerNumber();
        return new Player(Arrays.stream(playerNumber.split(""))
                .map(Integer::parseInt)
                .toList());
    }

    private <T> T repeat(Supplier<T> inputReader) {
        try {
            return inputReader.get();
        } catch (BaseballException e) {
            System.out.println(e.getMessage());
            return repeat(inputReader);
        }
    }
}
