package sports;

import java.util.ArrayList;

public class AthleteProfile {
    private String AthleteName;
    private String sport;
    private Stadium stadium;

    public AthleteProfile(String athleteName, String sport, Stadium stadium) {
        AthleteName = athleteName;
        this.sport = sport;

        if(stadium==null){
            stadium=new Stadium("","",4,"");
            //stadium=new ArrayList<>(); dla arraylist
        }
        else {
            stadium=new Stadium(stadium.getName(),stadium.getLocation(),stadium.getCapacity(),stadium.getHomeTeam());
            //stadium=stadium.clone; to dla arraylist
        }
    }

    public String getAthleteName() {
        return AthleteName;
    }

    public void setAthleteName(String athleteName) {
        AthleteName = athleteName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Stadium getStadium() {

        return stadium=new Stadium(stadium.getName(),stadium.getLocation(),stadium.getCapacity(),stadium.getHomeTeam());


    }

    public void setStadium(Stadium stadium) {
        if(stadium==null){
            stadium=new Stadium("","",4,"");
        }
        else {
            stadium=new Stadium(stadium.getName(),stadium.getLocation(),stadium.getCapacity(),stadium.getHomeTeam());
        }
        this.stadium = stadium;
    }
}
