package marathon;

import marathon.competitors.Competitor;
import marathon.obstacles.Obstacle;

class Course {
    private Obstacle[] course;

    Course(Obstacle... obstacle) {
        course = obstacle;
    }

    void doIt(Team team) {
        for (Competitor competitor : team.getCompetitors()) {
            for (Obstacle obstacle : course) {
                obstacle.doIt(competitor);
                if (!competitor.isOnDistance()) break;
            }
            System.out.println();
        }
    }
}
