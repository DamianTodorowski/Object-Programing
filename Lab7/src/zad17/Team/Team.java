package zad17.Team;

import java.util.ArrayList;
import java.util.Objects;

public class Team {
    private String name;
    private String city;

    private ArrayList<Integer> points = new ArrayList<Integer>();

    public Team(String name, String city, ArrayList<Integer> points) {
        this.name = name;
        this.city = city;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(city, team.city) && Objects.equals(points, team.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, points);
    }
}
