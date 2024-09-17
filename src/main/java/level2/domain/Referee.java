package level2.domain;

import java.util.List;

public class Referee {

    public Hint judge(final Computer computer, final Player player) {
        final List<Integer> computerNumbers = computer.getComputerNumber();
        final List<Integer> playerNumbers = player.getPlayerNumber();

        int strikeCount = 0;
        int ballCount = 0;
        boolean ended = false;

        for (int i = 0; i < computerNumbers.size(); i++) {
            if (computerNumbers.get(i).equals(playerNumbers.get(i))) {
                strikeCount++;
            } else if (computerNumbers.contains(playerNumbers.get(i))) {
                ballCount++;
            }
        }
        if (strikeCount == 3) {
            ended = true;
        }
        return new Hint(strikeCount, ballCount, ended);
    }
}
