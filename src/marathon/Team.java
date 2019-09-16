package marathon;

import marathon.competitors.Competitor;

public class Team {

    private Competitor[] team;

    public Team(Competitor... competitor) {
        team = new Competitor[competitor.length];

        for (int i = 0; i < competitor.length; i++) {
            team[i] = competitor[i];
        }
    }
}
