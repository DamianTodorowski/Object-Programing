package athleteTracker;

public class Athlete implements Comparable<Athlete>{
    private String name;
    private String sport;
    private double personalBest;

    public Athlete(String name, String sport, double personalBest) {
        this.name = name;
        this.sport = sport;
        this.personalBest = personalBest;
    }

    public double getPersonalBest() {
        return personalBest;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", personalBest=" + personalBest +
                '}';
    }

    @Override
    public int compareTo(Athlete a){
        return Double.compare(a.getPersonalBest(),this.personalBest);
    }
}
