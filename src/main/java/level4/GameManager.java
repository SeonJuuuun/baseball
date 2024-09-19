package level4;

import static level4.util.Repeat.repeat;

import level4.domain.GameConfig;
import level4.domain.Screen;
import level4.view.Input;
import level4.view.Output;

public class GameManager {

    private final GameConfig gameConfig;
    private BaseballGame baseballGame;

    public GameManager() {
        this.gameConfig = new GameConfig();
        this.baseballGame = gameConfig.createBaseballGame();
    }

    public void run() {
        Output.printInstructionsMessage();
        boolean running = true;
        while (running) {
            final Screen command = repeat(this::inputCommand);
            running = selectCommand(command);
        }
    }

    private Screen inputCommand() {
        Output.printLoadView();
        final String command = Input.readSelectCommand();
        return Screen.from(command);
    }

    private boolean selectCommand(final Screen command) {
        if (command.equals(Screen.SETTING)) {
            Output.printRequestDigitSize();
            gameConfig.configureDigitSize();
            Output.printDifficulty(gameConfig.getDigitSize());
            this.baseballGame = gameConfig.createBaseballGame();
            baseballGame.start();
            return true;
        }
        if (command.equals(Screen.START)) {
            baseballGame.start();
            return true;
        }
        if (command.equals(Screen.RECORD)) {
            Output.printGameStatus(gameConfig.getGameStats().getAttemptsStore());
            return true;
        }
        return !command.equals(Screen.EXIT);
    }
}
