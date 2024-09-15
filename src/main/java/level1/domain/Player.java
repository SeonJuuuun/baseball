package level1.domain;

import java.util.List;
import level1.exception.player.PlayerNumberSizeException;

public class Player {

    private static final int MAX_PLAYER_NUMBER_SIZE = 3;

    private final List<Integer> playerNumber;

    public Player(final List<Integer> playerNumber) {
        validatePlayerNumberSize(playerNumber);
        this.playerNumber = playerNumber;
    }

    private void validatePlayerNumberSize(final List<Integer> playerNumber) {
        if (playerNumber.size() != MAX_PLAYER_NUMBER_SIZE) {
            throw new PlayerNumberSizeException(playerNumber.size());
        }
    }
}
