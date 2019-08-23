import java.util.Random;

class Wall extends Obstacle {
    private final int heightMin = 50;
    private final int heightMax = 200;
    private Random rnd = new Random();

    Wall() {
        setHardAmount(heightMin + rnd.nextInt(heightMax - heightMin));
        setType("Стена");
        setUnits("см");
    }
}
