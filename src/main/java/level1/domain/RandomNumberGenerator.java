package level1.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {

    private static final int MAX_SIZE = 3;
    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;

    @Override
    public List<Integer> generate() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != MAX_SIZE) {
            set.add(random.nextInt(MAX_NUMBER) + MIN_NUMBER);
        }
        return new ArrayList<>(set);
    }
}
