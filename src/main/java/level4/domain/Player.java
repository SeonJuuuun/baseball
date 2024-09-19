package level4.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import level4.exception.player.PlayerNumberDuplicateException;
import level4.exception.player.PlayerNumberRangeException;
import level4.exception.player.PlayerNumberSizeException;

public class Player {

    private static final int MAX_PLAYER_NUMBER_RANGE = 9;
    private static final int MIN_PLAYER_NUMBER_RANGE = 1;

    private final List<Integer> playerNumber;
    private final int digitSize;

    public Player(final List<Integer> playerNumber, final int digitSize) {
        validatePlayerNumberRange(playerNumber);
        validateDuplicateNumber(playerNumber);
        this.playerNumber = playerNumber;
        this.digitSize = digitSize;
        validatePlayerNumberSize(playerNumber);
    }

    private void validatePlayerNumberSize(final List<Integer> playerNumber) {
        if (playerNumber.size() != digitSize) {
            throw new PlayerNumberSizeException();
        }
    }

    private void validatePlayerNumberRange(final List<Integer> playerNumber) {
        for (Integer number : playerNumber) {
            if (number < MIN_PLAYER_NUMBER_RANGE || number > MAX_PLAYER_NUMBER_RANGE) {
                throw new PlayerNumberRangeException(MIN_PLAYER_NUMBER_RANGE, MAX_PLAYER_NUMBER_RANGE);
            }
        }
    }

    private void validateDuplicateNumber(final List<Integer> playerNumber) {
        final Set<Integer> numberSet = new HashSet<>(playerNumber);
        if (numberSet.size() != playerNumber.size()) {
            throw new PlayerNumberDuplicateException("중복된 숫자가 있으면 안됩니다.");
        }
    }

    public List<Integer> getPlayerNumber() {
        return playerNumber;
    }
}
