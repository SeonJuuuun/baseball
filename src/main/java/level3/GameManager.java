package level3;

import static level2.util.Repeat.repeat;

import level3.domain.RandomNumberGenerator;
import level3.domain.Referee;
import level3.domain.Screen;
import level3.view.Input;
import level3.view.Output;

public class GameManager {

    private final BaseballGame baseballGame;

    public GameManager() {
        this.baseballGame = new BaseballGame(new RandomNumberGenerator(), new Referee());
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
        if (command.equals(Screen.START)) {
            baseballGame.start();
            return true;
        }
        return !command.equals(Screen.EXIT);
    }
}
