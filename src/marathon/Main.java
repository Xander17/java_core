package marathon;

import marathon.competitors.*;
import marathon.obstacles.*;

public class Main {
    public static void main(String[] args) {
        Team team=new Team(
                new Human("Боб"),
                new Cat("Барсик"),
                new Dog("Бобик")
        );

        Course course=new Course(
                new Cross(80),
                new Wall(2),
                new Wall(1),
                new Cross(120)
        );

        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
