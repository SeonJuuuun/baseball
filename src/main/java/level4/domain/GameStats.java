package level4.domain;

import java.util.HashMap;
import java.util.Map;

public class GameStats {

    private int gameCount;
    private int currentTryCount;
    private final Map<Integer, Integer> attemptsStore;

    public GameStats() {
        this.gameCount = 0;
        this.currentTryCount = 0;
        this.attemptsStore = new HashMap<>();
    }

    public void incrementGameCount() {
        gameCount++;
    }

    public void incrementTryCount() {
        currentTryCount++;
    }

    public void resetTryCount() {
        this.currentTryCount = 0;
    }

    public void recordAttemptsStore() {
        attemptsStore.put(gameCount, currentTryCount);
    }

    public Map<Integer, Integer> getAttemptsStore() {
        return new HashMap<>(attemptsStore);
    }
}
