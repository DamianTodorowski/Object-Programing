import pl.edu.uwm.zad7;

public class TestBase {
    public static void main(String[] args) {
        // Wywołanie metody statycznej z klasy bazowej
        Base.info(); // Wyświetli: This is the base class.

        // Wywołanie metody statycznej z klasy potomnej
        Child.info(); // Wyświetli: This is the child class.

        // Jeśli spróbujesz wywołać metodę statyczną z klasy potomnej na obiekcie klasy bazowej,
        // to również zostanie wywołana metoda z klasy bazowej
        Base baseObject = new Child();
        baseObject.info(); // Wyświetli: This is the base class.

        // Jeśli metoda statyczna jest przesłaniana, to zawsze zostanie wywołana z klasy, na której
        // została wywołana, a nie z klasy, której dotyczy referencja (jak w przypadku metod niestatycznych).

    }
}
