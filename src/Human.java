import java.util.Random;

public class Human implements BasicBehavior {
    private String type = "Человек";
    private int runAbility, jumpAbility;
    private final int runMin = 1000;
    private final int runMax = 1500;
    private final int jumpMin = 100;
    private final int jumpMax = 200;
    private Random rnd = new Random();

    Human() {
        runAbility = runMin + rnd.nextInt(runMax - runMin);
        jumpAbility = jumpMin + rnd.nextInt(jumpMax - jumpMin);
    }

    @Override
    public boolean run(Obstacle obstacle) {
        int length = obstacle.getHardAmount();
        System.out.println("Пытается пробежать " + length + obstacle.getUnits() + "..");
        if (length > runAbility) {
            System.out.println("Не хватило сил.");
            return false;
        }
        System.out.println("Готово!");
        return true;
    }

    @Override
    public boolean jump(Obstacle obstacle) {
        int height = obstacle.getHardAmount();
        System.out.println("Пытается взять высоту " + height + obstacle.getUnits() + "..");
        if (height > jumpAbility) {
            System.out.println("Слишком высоко.");
            return false;
        }
        System.out.println("Есть!");
        return true;
    }

    public String getType() {
        return type;
    }
}
