package marathon;

import marathon.competitors.Competitor;

public class Team {

    private Competitor[] team;

    public Competitor[] getCompetitors() {
        return this.team.clone();
    }

    Team(Competitor... competitor) {
        team = competitor;
    }

    void teamInfo() {
        System.out.println("Текущее состояние команды:");
        for (Competitor competitor : team) {
            competitor.info();
        }
        System.out.println();
    }

    void teamOnTrackInfo() {
        int onTrackCount=0;
        System.out.println("Остаются на трассе:");
        for (Competitor competitor : team) {
            if (competitor.isOnDistance()) {
                competitor.info();
                onTrackCount++;
            }
        }
        if (onTrackCount==0) System.out.println("Все участники сошли!");
        System.out.println();
    }
}
