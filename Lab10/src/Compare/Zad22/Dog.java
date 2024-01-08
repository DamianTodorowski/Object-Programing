package Compare.Zad22;

public class Dog extends Animal{
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }
    @Override
    public int compareTo(Animal otherAnimal) {
        if (otherAnimal instanceof Dog) {

            int animalComparison = super.compareTo(otherAnimal);

            if (animalComparison == 0) {

                Dog otherDog = (Dog) otherAnimal;
                return this.breed.compareTo(otherDog.breed);
            } else {
                return animalComparison;
            }
        } else {

            return super.compareTo(otherAnimal);
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
