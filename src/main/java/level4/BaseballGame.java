package level4;

import static level2.util.Repeat.repeat;

import java.util.Arrays;
import level4.domain.Computer;
import level4.domain.GameStats;
import level4.domain.Hint;
import level4.domain.NumberGenerator;
import level4.domain.Player;
import level4.domain.Referee;
import level4.view.Input;
import level4.view.Output;

public class BaseballGame {

    private final NumberGenerator numberGenerator;
    private final Referee referee;
    private final GameStats gameStats;

    public BaseballGame(final NumberGenerator numberGenerator, final Referee referee, final GameStats gameStats) {
        this.numberGenerator = numberGenerator;
        this.referee = referee;
        this.gameStats = gameStats;
    }

    public void start() {
        gameStats.incrementGameCount();
        gameStats.resetTryCount();
        Output.printStartMessage();
        final Computer computer = settingComputerNumber();
        play(computer);
    }

    private void play(final Computer computer) {
        while (true) {
            final Player player = repeat(this::inputPlayerNumber);
            gameStats.incrementTryCount();
            final Hint hint = referee.judge(computer, player);
            Output.printResult(hint);
            if (hint.isEnded()) {
                gameStats.recordAttemptsStore();
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
}
