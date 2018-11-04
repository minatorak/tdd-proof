import java.util.Random;

class Randomizes {
    private Random random;

    Randomizes(Random random) {
        this.random = random;
    }

    public int getRandomPattern() {
        return random.nextInt(2) + 1;
    }
}
