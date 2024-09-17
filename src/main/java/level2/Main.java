package level2;

import level2.domain.RandomNumberGenerator;
import level2.domain.Referee;

public class Main {
    public static void main(String[] args) {
        final BaseballGame baseballGame = new BaseballGame(new RandomNumberGenerator(), new Referee());
        baseballGame.start();
    }
}
