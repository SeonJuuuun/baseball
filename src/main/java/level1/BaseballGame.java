package level1;

import java.util.Arrays;
import level1.domain.Computer;
import level1.domain.NumberGenerator;
import level1.domain.Player;
import level1.view.Input;
import level1.view.Output;

public class BaseballGame {

    private final NumberGenerator numberGenerator;

    public BaseballGame(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Computer settingComputerNumber() {
        return new Computer(numberGenerator);
    }

    public Player inputPlayerNumber() {
        Output.requestPlayerNumber();
        final String playerNumber = Input.readPlayerNumber();
        return new Player(Arrays.stream(playerNumber.split(""))
                .map(Integer::parseInt)
                .toList());
    }
}
