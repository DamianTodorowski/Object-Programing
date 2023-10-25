//Utwórz klasę Dog z polami: name, breed i age. Napisz metodę bark(), która wydrukuje
//na konsoli "Wow Wow". Stwórz przypadek testowy, aby wywołać metodę co najmniej
//jeden raz.
public class TestDog {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
    }
}

class Dog{
    String name;
    String breed;
    int age;
    public void bark()
    {
        System.out.println("Wow wow");
    }

}