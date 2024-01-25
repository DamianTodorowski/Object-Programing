package sports;

import java.util.Arrays;

public class Athlete implements Cloneable{
    private String name;
    private Double[]times;

    public Athlete(String name, Double[] tab) {
        this.name = name;
        this.times = tab;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double[] getTab() {
        return times;
    }

    public void setTab(Double[] tab) {
        this.times=times;


    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", tab=" + Arrays.toString(times) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Kopiowanie Za pomocą konstruktora
        Athlete clonedAthlete = (Athlete) super.clone();

        // Skopiuj tablicę (głębokie kopiowanie)!!!!!
        clonedAthlete.times = this.times.clone();

        return clonedAthlete;
    }
}
