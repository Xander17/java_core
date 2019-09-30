package marathon;

import marathon.competitors.*;
import marathon.obstacles.*;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(
                new Human("Боб"),
                new Cat("Барсик"),
                new Dog("Бобик")
        );

        Course course = new Course(
                new Cross(80),
                new Wall(2),
                new Water(50),
                new Cross(120)
        );

        team.teamInfo();
        course.doIt(team);
        team.teamOnTrackInfo();
    }
}
