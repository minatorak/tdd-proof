import java.util.Random;

public class Randomizes {
    private Random random;

    Randomizes(Random random) { this.random = random; }

    public int getPattern() {
        return random.nextInt(2) + 1;
    }

    public int getOperator() {
        return random.nextInt(3) + 1;
    }

    public int getOperand() {
        return random.nextInt(9) + 1;
    }
}
