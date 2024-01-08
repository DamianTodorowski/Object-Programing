package Compare.Zad22;

public class Animal implements Comparable<Animal> {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    @Override
    public int compareTo(Animal otherAnimal) {

        if (this.age != otherAnimal.age) {
            return Integer.compare(this.age, otherAnimal.age);
        } else {
            return this.species.compareTo(otherAnimal.species);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }
}
