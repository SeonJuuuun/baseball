package level1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.Test;

class BaseballGameTest {

    @Test
    void asdf() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != 3) {
            set.add(random.nextInt(9) + 1);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }

}
