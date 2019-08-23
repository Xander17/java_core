import java.util.Random;

class Track extends Obstacle {
    private final int lenghtMin = 300;
    private final int lenghtMax = 1500;
    private Random rnd = new Random();

    Track() {
        setHardAmount(lenghtMin + rnd.nextInt(lenghtMax - lenghtMin));
        setType("Беговая дорожка");
        setUnits("м");
    }
}
