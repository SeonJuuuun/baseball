package level2.domain;

import java.util.List;

public class Computer {

    private final List<Integer> computerNumber;

    public Computer(final NumberGenerator numberGenerator) {
        this.computerNumber = numberGenerator.generate();
        computerNumber.forEach(System.out::print);
    }

    public List<Integer> getComputerNumber() {
        return computerNumber;
    }
}
