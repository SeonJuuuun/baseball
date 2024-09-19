package level4.util;

import java.util.function.Supplier;
import level4.exception.BaseballException;
import level4.view.Output;

public class Repeat {

    private Repeat() {
    }

    public static <T> T repeat(Supplier<T> inputReader) {
        try {
            return inputReader.get();
        } catch (BaseballException e) {
            System.out.println(e.getMessage());
            Output.printSpace();
            return repeat(inputReader);
        }
    }
}
