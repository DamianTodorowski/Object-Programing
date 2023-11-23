package zoo;


    public class TestAnimal {
        public static void main(String[] args) {
            Animal[] lista = {new Cat(),new Dog(),new Dog(), new Cat(), new Dog()};
            for(Animal a: lista)
            {
                System.out.println(a.makeSound());
            }

        }
    }


