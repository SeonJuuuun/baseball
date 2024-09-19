package level4.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {

    private final int digitSize;

    public RandomNumberGenerator(final int digitSize) {
        this.digitSize = digitSize;
    }

    @Override
    public List<Integer> generate() {
        final Set<Integer> set = new HashSet<>();
        final Random random = new Random();
        while (set.size() != digitSize) {
            set.add(random.nextInt(9) + 1);
        }
        return new ArrayList<>(set);
    }
}
