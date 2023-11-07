public class TestCar3 {
    public static void main(String[] args) {
        //Car[] carArray; // Deklaracja tablicy obiektów Car (brak inicjalizacji)

        // Próba dostępu do pola brand na obiekcie w niezainicjalizowanej tablicy
       // String carBrand = carArray[0].brand; // Spowoduje błąd "variable carArray might not have been initialized"
        Car3[] carArray = new Car3[5]; // Inicjalizacja tablicy obiektów Car z 5 elementami

        // Teraz możemy przypisać obiekty do tablicy
        carArray[0] = new Car3("Toyota");
        carArray[1] = new Car3("BMW");
        carArray[2] = new Car3("Audi");
        carArray[3] = new Car3("Dodge");
        carArray[4] = new Car3("Ford");

        // Teraz możemy bezpiecznie odwoływać się do pól brand na obiektach w tablicy
        String carBrand = carArray[1].brand;
        System.out.println("Marka auta w indexie 2: " + carBrand);
    }
}
class Car3 {
    public String brand;
    public Car3(String brand) {
        this.brand = brand;
    }
}

