package RekordyZad2;

public class TestAdress {
    public static void main(String[] args) {
        Adress a1 = new Adress("Gen. Pulaskiego",2,"06-200", "Maków Maz.");
        Person p1 = new Person("Damian","Todorowski",a1);
        System.out.println(p1);
    }
}
