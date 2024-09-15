package level1;

import level1.domain.RandomNumberGenerator;
import level1.domain.Referee;

public class Main {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame(new RandomNumberGenerator(), new Referee());
        baseballGame.start();
    }
}
