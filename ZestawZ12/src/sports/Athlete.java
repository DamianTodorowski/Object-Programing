package sports;

import java.util.Arrays;

public class Athlete implements Cloneable {
    private String name;
    private double[] times;

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getTimes() {
        return times;
    }

    public void setTimes(double[] times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", times=" + Arrays.toString(times) +
                '}';
    }

    public Athlete clone() throws CloneNotSupportedException {

            //Kopiowanie Za pomocą konstruktora
            Athlete clonedAthlete = (Athlete) super.clone();

            // Skopiuj tablicę (głębokie kopiowanie)!!!!!
            clonedAthlete.times = this.times.clone();

            return clonedAthlete;

    }
}
