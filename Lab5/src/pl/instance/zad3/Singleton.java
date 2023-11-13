package pl.instance.zad3;
public class Singleton {

    private static Singleton instance; // Pole statyczne przechowujące jedyną instancję klasy

    // Prywatny konstruktor uniemożliwiający tworzenie nowych instancji
    private Singleton() {
        // Inicjalizacja obiektu Singleton
    }

    // Publiczna statyczna metoda dostępu do instancji Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Przykładowa metoda klasy Singleton
    public void Shout() {
        System.out.println("Wywołano metodę klasy Singleton.");
    }
}