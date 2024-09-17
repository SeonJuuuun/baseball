package level2;

import java.util.Arrays;
import java.util.function.Supplier;
import level2.domain.Computer;
import level2.domain.Hint;
import level2.domain.NumberGenerator;
import level2.domain.Player;
import level2.domain.Referee;
import level2.exception.BaseballException;
import level2.view.Input;
import level2.view.Output;

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
            Output.printResult(hint);
            if (hint.isEnded()) {
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
            Output.printSpace();
            return repeat(inputReader);
        }
    }
}
