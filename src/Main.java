import java.util.Random;

public class Main {
    private static Obstacle[] obstaclesPath = new Obstacle[10];
    private static BasicBehavior[] competitors = new BasicBehavior[5];
    private static Random rnd = new Random();

    public static void main(String[] args) {
        setObstacles();
        setCompetitors();
        startCompetition();
    }

    private static void setObstacles() {
        System.out.println("Полоса препятствий:");
        for (int i = 0; i < 10; i++) {
            if (rnd.nextInt(2) == 0) obstaclesPath[i] = new Wall();
            else obstaclesPath[i] = new Track();
            System.out.println(obstaclesPath[i].getType() + " - " + obstaclesPath[i].getHardAmount() + obstaclesPath[i].getUnits());
        }
        System.out.println();
    }

    private static void setCompetitors() {
        System.out.println("Участники:");
        for (int i = 0; i < 5; i++) {
            int choose = rnd.nextInt(3);
            switch (choose) {
                case 0:
                    competitors[i] = new Human();
                    break;
                case 1:
                    competitors[i] = new Cat();
                    break;
                case 2:
                    competitors[i] = new Robot();
                    break;
            }
            System.out.println(competitors[i].getType());
        }
        System.out.println();
    }

    private static void startCompetition() {
        for (BasicBehavior competitor : competitors) {
            boolean result = true;
            System.out.println(competitor.getType() + " выходит на старт!");
            for (Obstacle obstacle : obstaclesPath) {
                if (obstacle instanceof Wall) result = competitor.jump(obstacle);
                else result = competitor.run(obstacle);
                if (!result) break;
            }
            if (result) System.out.println(competitor.getType() + " успешно прошел полосу препятствий!");
            else System.out.println("В этот раз не вышло :(");
            System.out.println();
        }
        System.out.println("Слава роботам!");
    }
}