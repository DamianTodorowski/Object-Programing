package zoo;


public class TestAnimal {
    public static void main(String[] args) {
        Animal[] lista={new Cat(),new Dog(),new Dog(),new Cat(),new Cat()};

        for (Animal animal : lista) {
            System.out.println(animal.makeSound());
        }
        }
    }


