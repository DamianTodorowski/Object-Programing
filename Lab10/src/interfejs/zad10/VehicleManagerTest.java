package interfejs.zad10;

public class VehicleManagerTest {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle();
        Car c1 = new Car();
        System.out.println(c1.getFuelLevel());
        System.out.println(c1.startEngine());
        System.out.println(m1.getFuelLevel());
        System.out.println(m1.startEngine());

    }
}
