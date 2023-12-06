package RekordyZad6;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "RS6", 15);
        System.out.println(c1);
        System.out.println("Podroż tym autem będzie kosztować: "+c1.fuelcost(5.99,450)+"zł.");
    }
}
