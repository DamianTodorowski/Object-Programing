//Stwórz klasę Cat z polem name. Dodaj do klasy Cat metodę createCat, która zwraca
//nowy obiekt klasy Cat. Metoda powinna ustawiać pole name na podaną wartość, ale
//tylko jeśli wartość nie jest null. W przeciwnym razie powinna zwracać null. W klasie
//Main użyj metody createCat do stworzenia obiektu cat, a następnie spróbuj wydrukować wartość pola name. Co się stanie, jeśli przekażesz null jako argument do metody
//createCat? Przeanalizuj wynik.
public class TestCat {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = c1.createCat("Puszek");
        System.out.println(c2.name);
        Cat c3 = c1.createCat(null);
        System.out.println(c3);
    }
}

class Cat
{
    String name;

    public Cat createCat(String value)
    {
        Cat temp = new Cat();
        if (value != null)
        {
            temp.name = value;
        }
        else
        {
            return null;
        }
        return temp;
    }
}