package utilities;

public class TestPerson {
    public static void main(String[] args) {
        Person[]people={
                new Person("Alicja",21),
                new Person("Adrian",23),
                new Person("Maria",20),
                new Person("Mariusz",19)
        };
        Person object = new Person("",21);
        int couner = GenericCountLessThanOrEqual.countLessThanOrEqual(people,object);
        System.out.println(couner);
    }
}
