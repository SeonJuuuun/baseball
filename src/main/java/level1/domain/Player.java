package level1.domain;

import java.util.List;
import level1.exception.player.PlayerNumberRangeException;
import level1.exception.player.PlayerNumberSizeException;

public class Player {

    private static final int MAX_PLAYER_NUMBER_SIZE = 3;
    private static final int MAX_PLAYER_NUMBER_RANGE = 9;
    private static final int MIN_PLAYER_NUMBER_RANGE = 1;

    private final List<Integer> playerNumber;

    public Player(final List<Integer> playerNumber) {
        validatePlayerNumberSize(playerNumber);
        validatePlayerNumberRange(playerNumber);
        this.playerNumber = playerNumber;
    }

    private void validatePlayerNumberSize(final List<Integer> playerNumber) {
        if (playerNumber.size() != MAX_PLAYER_NUMBER_SIZE) {
            throw new PlayerNumberSizeException(playerNumber.size());
        }
    }

    private void validatePlayerNumberRange(final List<Integer> playerNumber) {
        for (Integer number : playerNumber) {
            if (number < MIN_PLAYER_NUMBER_RANGE || number > MAX_PLAYER_NUMBER_RANGE) {
                throw new PlayerNumberRangeException(MIN_PLAYER_NUMBER_RANGE, MAX_PLAYER_NUMBER_RANGE);
            }
        }
    }
}
