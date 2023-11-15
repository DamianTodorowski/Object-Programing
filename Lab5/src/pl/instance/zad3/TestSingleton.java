package pl.instance.zad3;

class TestSingleton {
    public static void main(String[] args) {
        // Uzyskanie instancji
        Singleton singleton1 = Singleton.getInstance();

        //przykładowe wywołanie
        singleton1.Shout();

        // Sprawdzenie, czy kolejne uzyskanie instancji zwróci ten sam obiekt
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Czy obiekt singleton1 i singleton2 są tym samym obiektem? " + (singleton1 == singleton2));
    }
}
