package Compare.Zad22;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class TestAnimal {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();


        animalList.add(new Animal("Lion", 5));
        animalList.add(new Dog("Dog", 3, "Labrador"));
        animalList.add(new Animal("Elephant", 10));
        animalList.add(new Dog("Dog", 4, "German Shepherd"));
        animalList.add(new Animal("Zebra", 2));


        System.out.println("Przed sortowaniem:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }

        // Sortowanie listy zwierząt za pomocą Collections
        Collections.sort(animalList);


        System.out.println("Po sortowaniu:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}
