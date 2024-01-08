package KlFinalneZad5;

public class Television extends Electronics{

    void turnOn() { //błąd. nie można nadpisać electronics gdy jest finalna

        System.out.println("Telewizor włączony");
    }
}
