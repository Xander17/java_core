package marathon;

import marathon.obstacles.Obstacle;

public class Course {
    private Obstacle[] course;

    public Course(Obstacle... obstacle) {
        course = new Obstacle[obstacle.length];

        for (int i = 0; i < obstacle.length; i++) {
            course[i] = obstacle[i];
        }
    }
}
